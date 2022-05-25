package com.example.kotlincodechallenges.leetcode
/*
You are given an array of binary strings strs and two integers m and n.

Return the size of the largest subset of
strs such that there are at most m 0's and n 1's in the subset.

A set x is a subset of a set y if all elements of x are also elements of y.

Example 1:
Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
Output: 4
Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"},
so the answer is 4.
Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
{"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.

Example 2:
Input: strs = ["10","0","1"], m = 1, n = 1
Output: 2
Explanation: The largest subset is {"0", "1"}, so the answer is 2.
 */


fun main() {
    val strs = arrayOf("10","0001","111001","1","0")
    val strs2 = arrayOf("10","0","1")
    println(findMaxBruteForce(strs,5,3))
    println(findMaxBruteForce(strs2,1,1))
}
// not correct
fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
    var result = 0

    for(i in strs) {
        if(!(i.length >= m && i.length > n)) {
            println("$i meets the criteria")
            result++
        } else {
            println("$i does not meet the criteria")
        }
    }

    return result
}
//not correct
fun findMaxBruteForce(strs: Array<String>, m: Int, n: Int): Int {
    var results = 0
    var oneCount = 0
    var zeroCount = 0

    for (i in strs) {
        for (c in i) {
            if(c.digitToInt() == 1) {
                oneCount++
            } else {
                zeroCount++
            }
        }
        if ((oneCount <= n && zeroCount <= m)) {
            results++
        }
        oneCount = 0
        zeroCount = 0
    }

    return results
}