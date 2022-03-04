package com.example.kotlincodechallenges.jpmc

fun main() {
    val array = arrayOf("a", "b", "c")

    println("Before Left: ${array.joinToString(",")}")
    leftRotate(array)
    println("After Left:  ${array.joinToString(",")}")

    val arrayNum = arrayOf("a", "b", "c")
    println("Before LeftNum: ${arrayNum.joinToString(",")}")
    leftRotateNumberOfTimes(arrayNum, 2)
    println("After LeftNum:  ${arrayNum.joinToString(",")}")

    val array2 = arrayOf("a", "b", "c")
    println("Before Right: ${array2.joinToString(",")}")
    rightRotate(array)
    println("After Right:  ${array2.joinToString(",")}")
}

private fun leftRotate(array: Array<String>) {
    val first = array[0]

    for (i in 1 until array.size) {
        array[i - 1] = array[i]
    }
    array[array.size - 1] = first
}

private fun leftRotateNumberOfTimes(array: Array<String>, times: Int) {
    val first = array[0]

    repeat(times) {
        for (i in 1 until array.size) {
            array[i - 1] = array[i]
        }
        array[array.size - 1] = first
    }
}

private fun rightRotate(array: Array<String>) {
    val last = array[array.size - 1]
    for (i in array.size - 2 downTo 0) {
        array[i + 1] = array[i]
    }
    array[0] = last
}

//private fun javaLeft