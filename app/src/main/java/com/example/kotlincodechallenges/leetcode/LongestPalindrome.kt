package com.example.kotlincodechallenges.leetcode
/*

Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.
 */

fun main() {
    val s = "babad"
    longestPalindrome(s)
}

fun longestPalindrome(s: String): String {
    var start = 0
    var end = s.length - 1

    var result = StringBuilder()

    while (start<end) {
        if (s[start] == s[end]) {
            result.append(start)
        }
        start++
        end--
    }
    return result.toString()
}