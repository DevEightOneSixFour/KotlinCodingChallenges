package com.example.kotlincodechallenges

import kotlin.system.measureTimeMillis

fun main() {
    val string = "hello world this is a happy little world isn't it my guys"
    countString(string)
}

fun countString(str: String) {

    val newMap = HashMap<Char,Int>()

    println(str)
    val time = measureTimeMillis {
        for (c in str) {
            if (c == ' ') {
                continue
            } else if (!newMap.containsKey(c)) {
                newMap[c] = 1
            } else {
                newMap[c] = newMap.getValue(c) + 1
            }
        }
    }

    println(newMap.entries)
    println("Time: ${time}ms")

}