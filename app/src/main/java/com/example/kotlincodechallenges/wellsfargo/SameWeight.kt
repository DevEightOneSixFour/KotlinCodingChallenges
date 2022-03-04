package com.example.kotlincodechallenges.wellsfargo

// 3. You have a team of Android developers,
// write a function which determines how many team members have the same weight?
// Weights in lbs: 180, 175, 201, 157, 175, 198, 136
fun main() {

    sameWeights(intArrayOf(180, 175, 201, 157, 175, 198, 136, 175, 175))
}

fun sameWeights(arr: IntArray) {

    val newMap = mutableMapOf<Int, Int>()

    for (i in arr) {
        if (!newMap.contains(i)) {
            newMap[i] = 1
        } else {
            newMap[i] = newMap.getValue(i) + 1
        }
    }

    for ((key, value) in newMap) {
        println("Weight: ${key}lbs -> Occurrence: $value")
    }
}