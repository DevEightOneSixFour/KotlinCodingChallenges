package com.example.kotlincodechallenges

import kotlin.system.measureTimeMillis

fun main() {
    val string = "hello world this is a happy little world isn't it my guys"
    countString(string)
}

fun countString(str: String) {

    val newMap = HashMap<Char,Int>()
    val names = listOf(Names(1, "String"), Names(2, "Bean"))
    println(names)

    println(str)
    val time = measureTimeMillis {
        for (c in str) {
            if (c == ' ') {
                continue
            } else if (!newMap.containsKey(c)) {
                newMap[c] = 1
            } else {
                newMap[c] = newMap.getValue(c) + 1
            }
        }
    }

    println(newMap.entries)
    println("Time: ${time}ms")

}

data class Names(
    val id: Int,
    val value: String
)


//fun main() {
//    println(countStrings(arrayOf("arrow", null, "computer", "nice")))
//    println(countStringsAli(arrayOf("arrow", "computer", "nice")))
//
//}
//
//fun countStringsAli(list: Array<String?>):MutableList<String>{
//    val mutableList= list.filter {it.length >= 5}
//
//    if (mutableList.size>0){
//        return mutableList as MutableList<String>
//    }else return mutableListOf("There are not strings with 5 or more characters")
//
//
//}
//
//fun countStrings(list: Array<String?>?):MutableList<String>{
//
//    val mutableList= mutableListOf<String>()
//
//    // if empty Array, return empty list
//    if(list?.isEmpty() == true || list == null) {
//        return mutableListOf("Empty List")
//    }
//
//    for(n in list){
//        // if current n is null
//        if(n == null) {
//            continue
//        } else {
//            val count = n.count()
//            if (count >= 5){
//                mutableList.add(n)
//            }
//        }
//    }
//    if (mutableList.size>0){
//        return mutableList
//    }else return mutableListOf("There are not strings with 5 or more characters")
//
//}