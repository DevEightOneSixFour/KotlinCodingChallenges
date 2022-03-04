package com.example.kotlincodechallenges.paypal

import java.util.Collections.swap
fun main() {
    val input = intArrayOf(1,2,3,4)

    permute(input, 0, input.size)
}

fun permute(input: IntArray, start: Int, end: Int) {
    var temp = input

    if (start == end){
        println(temp)
    } else {
        for (i in start..end) {
//            permute()
        }
    }
}

fun swapNums(input: IntArray, start: Int, end: Int) {
    val temp = input[start]
    input[start] = input[end]
    input[end] = temp
}