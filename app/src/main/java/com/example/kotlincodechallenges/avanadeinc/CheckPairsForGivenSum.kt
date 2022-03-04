package com.example.kotlincodechallenges.avanadeinc

fun main() {
    checkPairsForGivenSum(intArrayOf(8, 8, 8, 20, 1, 2, 3, 4, 5, 7, 6, 8), 8)
}

fun checkPairsForGivenSum(array: IntArray, sumCheck: Int) {

    val pastNumbers = mutableSetOf<Int>()

    for (i in array) {
        // if a number in the array is greater than
        // the given sum, skip this number
        if (i >= sumCheck) {
            continue
        } else if (pastNumbers.contains(i)) {
            continue
        }
        for (j in array) {
            if (pastNumbers.contains(j)) {
                continue
            } else if (i + j == sumCheck) {
                println("$i + $j = $sumCheck")
            }
        }
        pastNumbers.add(i)
    }
}
