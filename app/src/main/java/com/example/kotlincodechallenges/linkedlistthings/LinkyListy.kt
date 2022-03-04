package com.example.kotlincodechallenges.linkedlistthings

import java.util.*

fun main() {
    // each value know the front and next elements to them
    val linky = LinkedList<String>()

    calculateGrad()

    linky.add("Rob")
    linky.add("Alex")
    linky.add("Jose")

    linky.clone()

    println(linky)
    println(linky[2])

    for (i in linky.indices) {
        if (linky[i] == "Alex")
            print(linky[i])
    }
}

fun calculateGrad() {
    val grad = (2.0/10.0) * 100.00

    println("Grade: $grad%")
}

class Student(var name: String) {
    // init() {} is not a thing in Kotlin
    init {
        println("Student has got a name as $name")
    }

    // var is not allowed in a Secondary constructor
    // this(sectionName) needs the ':' before it
    constructor(sectionName: String, id: Int) : this(sectionName) {}
}

/*
class Student (var name: String) {
    init() {
        println("Student has got a name as $name")
    }
    constructor(sectionName: String, var id: Int) this(sectionName) {}
}
 */

/*
// Sorting a large list
val largeList = arrayListOf(1000000)
val scope = CoroutineScope(Dispatchers.Default + Job())

suspend fun sortList() {
 largeList.sort()
}

fun doSorting() {
  val sortedListFinished = scope.async {
    sortList()
  }

  // Notice the sorting when finish
 sortedListFinished.await()
}
 */