package com.example.kotlincodechallenges.leetcode

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""

Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
 */

fun main() {
    val strs = arrayOf("flower","flow","flight")
    val strs2 = arrayOf("dog","racecar","car")
//    leastCommonPrefix(strs)
//    leastCommonPrefix(strs2)
    println(longestCommonPrefix(strs))
    println(longestCommonPrefix(strs2))
}

//fun leastCommonPrefix(array: Array<String>) {
//    var result = array[0]
//    var currentSubString = 0
//
//    for (i in 1 until array.size) {
//        result
//    }
//
//
//    println(result.substring(0, currentSubString))
//}

//fun longestCommonPrefix(strs: Array<String>): String {
//    val w = strs[0]
//    w.forEachIndexed { i, c ->
//        if (strs.any { it.length == i || it[i] != c } ) return w.substring(0, i)
//    }
//    return w
//}
fun longestCommonPrefix(strs: Array<String>): String {

    val sortedList = strs.sorted()
    val (first, last) = sortedList.first() to sortedList.last()
    val shortLastIndex = if (first.lastIndex < last.lastIndex) first.lastIndex else last.lastIndex

    var commonPrefixCount = 0

    for(i in 0..shortLastIndex) {
        if( first[i] != last[i] ) break

        // now time to increase
        ++commonPrefixCount
    }

    return first.substring(0, commonPrefixCount)
}
