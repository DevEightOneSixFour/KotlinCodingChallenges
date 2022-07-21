package com.example.kotlincodechallenges.leetcode

fun main() {
//    println(stringPalindrome("helleh"))
    println(numberPalindrome(1032101))
//    println(kotlinPalindrome("helleh"))
    println(actualNumberPalindrome(1032101))
    println(actualNumberPalindrome(102201))
}

// target 10
// 1,2,3,4,5,6,7,8

fun kotlinPalindrome(string: String): Boolean = string == string.reversed()

fun stringPalindrome(string: String): Boolean {

    // Pointers pointing to the beginning
    // and the end of the string
    var i = 0
    var j = string.length - 1

    // While there are character to compare
    while (i<j) {

        // if there is a mismatch
        if (string[i] != string[j]) {
            return false
        }
        i++
        j--
    }
    return true
}

fun numberPalindrome(int: Int): Boolean {
    val string = int.toString()

    // Pointers pointing to the beginning
    // and the end of the string
    var i = 0
    var j = string.length - 1

    // While there are character to compare
    while (i<j) {

        // if there is a mismatch
        if (string[i] != string[j]) {
            return false
        }
        i++
        j--
    }
    return true
}

fun actualNumberPalindrome(num: Int): Boolean {

    var tempNum = num
    var reverseNumber = 0
    var remainder : Int

    while (tempNum != 0) {
        remainder = tempNum % 10
        reverseNumber = reverseNumber * 10 + remainder
        tempNum /= 10
    }

    if (num != reverseNumber) return false

    return true
}