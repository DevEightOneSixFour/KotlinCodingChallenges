package com.example.kotlincodechallenges.capitalone

/*
    Find the sum of the unique sub-arrays
    Given: [1,2,3]
    Output: 1+1, 1+2, 1+3, 2+2, 2+3, 3+3 = 24
 */
fun main() {
    // [3,1,7,9,2,1,9,3]
    val array = intArrayOf(3,1,7,9,2,1,9,3)
    subArraySum(array)
    betterArraySum(array)
}

fun subArraySum(array: IntArray) {
    val set = HashSet<Int>()
    var result = 0

    for (i in array) {
        for (j in array) {
            if (set.contains(j)) {
                continue
            } else {
                result += i + j
            }
        }
        set.add(i)
    }
    println("Result: $result")
}

fun betterArraySum(array: IntArray) {
    //
    val set = HashSet<Int>()
    var result = 0
    val n = array.size

    for (i in array.indices) {
        result += array[i] * (n - i) * (i + 1)
    }
    println("Better Result: $result")
}