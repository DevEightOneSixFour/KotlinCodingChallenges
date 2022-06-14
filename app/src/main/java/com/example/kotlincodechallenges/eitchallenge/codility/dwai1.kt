//package com.example.kotlincodechallenges.eitchallenge.codility
//
//fun main() {
//val uni = University(Repository())
//    val array = emptyArray<>()
//}
//
//class University(private val repository: Repository<Student>) {
//    val studentList: List<Student> = repository.get().asSequence().toList()
//    fun getPaidCoursesWithTheNumbersOfSubscribedStudents(coursesCount: Int): Map<Course, Int> {
//        var courseMap = mutableMapOf<Course, Int>()
//        for (student in studentList) {
//            val courseOpted: List<Course> = student.subscribedCourses
//            for (courseOpted in student.subscribedCourses) {
//                if (courseMap.size != coursesCount) {
//                    if (courseOpted.isPaid) {
//                        if (courseMap.containsKey(courseOpted)) {
//                            courseMap[courseOpted] = courseMap.get(courseOpted)!!.plus(1)
//                        } else {
//                            courseMap[courseOpted] = 1
//                        }
//
//                    }
//                }
//            }
//        }
//
//        return courseMap
//
//    }
//}
//
//class Repository<T>() {
//    fun get(): Sequence<Student> {
//        return sequenceOf(
//            Student(
//            id = 1,
//                name = "John"
//            ),
//            Student(
//                id = 2,
//                name = "Jon"
//            ),
//            Student(
//                id = 3,
//                name = "Juan"
//            )
//        )
//    }
//}
//
//data class Student(val id: Int, val name: String, val subscribedCourses: List<Course>)
//
//data class Course(val id: Int, val name: String, val isPaid: Boolean)