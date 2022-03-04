package com.example.kotlincodechallenges.frb

fun main() {
    val array = intArrayOf(1,2,3,4,5)
    println(printPairs(array, 5))
}

fun printPairs(arr: IntArray, sum: Int): Int {
    val s = HashSet<Int>()
    var count = 0

    for (i in arr.indices) {
        //if(arr[i] >= sum) break
        val temp = sum - arr[i]
        if (s.contains(temp)) {
            count++
        }
        s.add(arr[i])
    }
    return count
}