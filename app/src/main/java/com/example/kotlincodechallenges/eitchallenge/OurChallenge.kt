package com.example.kotlincodechallenges.eitchallenge

/*
Implement an algorithm to determine if a string has all unique characters
"abc" = true
"abba" = false
 */

const val ALPHABET = "abcdefghijklmnopqrstuvwxyz" // true
const val NONPHABET = "zazazazazazazazazazazaza" // false

fun main() {
    println(areThereDuplicates("abc"))
    println(areThereDuplicates("abba"))
    println(areThereDuplicates(ALPHABET))
    println(areThereDuplicates(NONPHABET))
    println(hasDuplicates("abc".toList()))
    println(hasDuplicates("abba".toList()))
    println(hasDuplicates(ALPHABET.toList()))
    println(hasDuplicates(NONPHABET.toList()))
}

fun areThereDuplicates(str: String): String {
    val distinct = str.toCharArray().distinct().count()

    return if (distinct == str.length) {
        "Input string '$str' does not contain duplicates"
    } else {
        "Input string '$str' contains duplicates"
    }
}

fun <T> hasDuplicates(array: List<T>): Boolean {
    return array.size == array.distinct().count()
}