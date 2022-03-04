package com.example.kotlincodechallenges.walmart

fun main() {
    println(binaryStringSum("11", "1")) // 100
    println(binaryStringSum("1010", "1011")) // 10101
}

fun binaryStringSum(a: String, b: String): String =
    Integer.toBinaryString(
        Integer.parseInt(a, 2) + Integer.parseInt(b, 2))

