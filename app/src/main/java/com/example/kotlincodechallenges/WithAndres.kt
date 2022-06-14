package com.example.kotlincodechallenges

fun main() {
    println(countStrings(arrayOf("arrow", null, "computer", "nice")))
    println(countStringsAli(arrayOf("arrow", "computer", "nice")))
    println(countStrings(null))

}


fun countStringsAli(list: Array<String>): MutableList<String> {
    val mutableList = list.filter { it.length >= 5 }

    return if (mutableList.isNotEmpty()) mutableList as MutableList<String>
    else mutableListOf("There are not strings with 5 or more characters")
}

fun countStrings(list: Array<String?>?): MutableList<String> {
    val mutableList = mutableListOf<String>()
    // if empty Array, return empty list
    if (list?.isEmpty() == true || list == null) {
        return mutableListOf("Empty List")
    }

    for (n in list) {
        // if current n is null
        if (n == null) {
            continue
        } else {
            val count = n.count()
            if (count >= 5) {
                mutableList.add(n)
            }
        }
    }
    return if (mutableList.size > 0) {
        mutableList
    } else mutableListOf("There are not strings with 5 or more characters")

}

//class University(private val repository: Repository<Student>) {
//    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int> {
//        val resultMap = mutableMapOf<Course,Int>()
//
//        val students = repository.get()
//
//        for(i in students) {
//            for(j in i.subscribedCourses) {
//                if(!resultMap.contains(j) && j.isPaid == true && resultMap.size != coursesCount) {
//                    resultMap[j] = 1
//                } else if (resultMap.contains(j) && j.isPaid == true) {
//                    resultMap[j] = resultMap.getValue(j) + 1
//                }
//            }
//        }
//        val result = resultMap.toList().sortedByDescending { (_, takers) -> takers}.toMap()
//        /*println("Count: $coursesCount")
//       for((key,value) in result) {
//            println("Key: $key | Value: $value")
//        }*/
//        return result
//    }
//
//}