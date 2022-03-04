package com.example.kotlincodechallenges.leetcode

/*
For example, 2 is written as II in Roman numeral, just two one's added together.
12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII.
Instead, the number four is written as IV.
Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */
fun main() {
    println(romanToInteger("MCMXCIV"))
}

fun romanToInteger(s: String): Int {
    var lastNumeral = ' '
    var result = 0

    for (c in s) {
        when (c) {
            'M' -> {
                result += if (lastNumeral == 'C') {
                    800
                } else 1000
            }
            'D' ->{
                result += if (lastNumeral == 'C') {
                    300
                } else 500
            }
            'C' -> {
                result += if (lastNumeral == 'X') {
                    80
                } else 100
            }
            'L' ->{
                result += if (lastNumeral == 'X') {
                    30
                } else 50
            }
            'X' -> {
                result += if (lastNumeral == 'I') {
                    8
                } else 10
            }
            'V' -> {
                result += if (lastNumeral == 'I') {
                    3
                } else 5
            }
            'I' -> result++
        }
        lastNumeral = c
    }
    return result
}