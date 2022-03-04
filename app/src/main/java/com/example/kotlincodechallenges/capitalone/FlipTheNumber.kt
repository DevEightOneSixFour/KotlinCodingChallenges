package com.example.kotlincodechallenges.capitalone

import kotlin.math.absoluteValue

// having a number, reverse it, include cases like negatives or decimals
fun main() {

    println("Reversed Number: ${reverseTheNumber(1234)}")
}

fun reverseTheNumber(number: Int): Int {
    println("Original Number: $number")
    var temp = number
    var result = 0

    // run loop until number become 0
    while (temp != 0) {

        // get last digit from number
        val currentIndex = temp % 10
        result = result * 10 + currentIndex

        //remove the last digit from number
        temp /= 10
    }
    return result
}