package com.example.kotlincodechallenges.wayfair

fun main() {
    val intArray = intArrayOf(1,1,0,0,1)
    val arrayList = arrayListOf(1,1,0,0,1)
    readLetters(intArray)
    readLetterFromTony(arrayList)
}

fun readLetters(array: IntArray) {
    var actions = 0
    var previous = 0

    for (i in array) {
        if (i == 1 || previous == 1) actions++

        previous = i
    }
    println("Actions: $actions")
}

fun readLetterFromTony(array: ArrayList<Int>) {
    val operations : Int

    val op = array.zipWithNext { a, b -> if (a != b) 1 else 0 }
    println("OP: $op")
    operations = if (op.size == 1 && op[0] == 0) {
        0
    } else {
        op.size
    }
    println("Operations: $operations")
}