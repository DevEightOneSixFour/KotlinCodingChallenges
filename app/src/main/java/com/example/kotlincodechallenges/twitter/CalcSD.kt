package com.example.kotlincodechallenges.twitter

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val numArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    val numList = listOf(16.83f, 11.15f, 14.20f, 9.88f, 19.19f)
    val SD = calculateSD(numArray)
    val sd = getSD(numList)

//    System.out.format("Standard Deviation = %.6f", SD)
//    println("")
//    System.out.format("Standard Deviation = %.6f", sd)
//    println("")

    println("Standard Deviation = %.6f".format(SD))
    println("Standard Deviation = %.6f".format(sd))
}

fun calculateSD(numArray: DoubleArray): Double {
    var sum = 0.0
    var standardDeviation = 0.0

    for (num in numArray) {
        sum += num
    }

    val mean = sum / 10

    for (num in numArray) {
        standardDeviation += Math.pow(num - mean, 2.0)
    }

    return Math.sqrt(standardDeviation / 10)
}

fun getSD(list: List<Float>): Float {
    var sum = 0.0
    var sd = 0.0

    for (i in list) {
        sum += i
    }

    val mean = sum / list.size

    for (j in list) {
        sd += (j - mean).pow(2.0)
    }

    return sqrt(sd / list.size).toFloat()
}