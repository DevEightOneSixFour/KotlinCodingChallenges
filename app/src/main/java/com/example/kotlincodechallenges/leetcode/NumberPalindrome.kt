package com.example.kotlincodechallenges.leetcode

fun main() {
    println(stringPalindrome("helleh"))
    println(numberPalindrome(1032101))
}

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