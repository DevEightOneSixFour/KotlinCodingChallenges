package com.example.kotlincodechallenges.capitalone

import kotlin.math.absoluteValue

// Given a list of temperatures (negative included) print the one closest to zero

fun main() {
    println(closeToZero(listOf(1.1,123.0,-1.0,-2.2,2.1,9.0)))
    println(closeToZero(listOf(122.0,123.0,-1.1,1.1, -2.2,2.1,9.0)))
    println(zeroTooClose(listOf(1.1,123.0,-1.0,-2.2,2.1,9.0)))
    println(zeroTooClose(listOf(122.0,123.0,-1.1,1.1, -2.2,2.1,9.0)))
}

// with absoluteValue
fun closeToZero(list: List<Double>) : Double {
    println("---CloseToZero---")

    var result = Double.MAX_VALUE

    for(num in list) {
        if(num.absoluteValue <= result.absoluteValue) {
            result = num
        }
    }
    return result
}

// without absoluteValue
fun zeroTooClose(list: List<Double>) : Double {
    println("---ZeroTooClose---")

    var result = Double.MAX_VALUE
    var temp: Double

    for(num in list) {
        if (num < 0) {
            temp = num * -1.0
            if (temp <= result) {
                result = (temp * -1.0)
            }
        }else if(num <= result) {
            result = num
        }
    }
    return result
}
