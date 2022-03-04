package com.example.kotlincodechallenges.leetcode


fun main() {

    val intArray1 = intArrayOf(1, 3)
    val intArray2 = intArrayOf(1, 4)
    val intArray3 = intArrayOf(2, 3)
    val intArray4 = intArrayOf(2, 4)
    val intArray5 = intArrayOf(4, 3)
    val array = arrayOf(intArray1, intArray2, intArray3, intArray4, intArray5)

    println(findJudge(3, array))
}

fun findJudge(n: Int, trust: Array<IntArray>): Int {
    val count = IntArray(n)
    for (ints in trust) {
        count[ints[0]]--
        count[ints[1]]++
    }

    for(i in 1..n) {
        if (count[i] == n-1) return i
    }

    return -1
}
 val flag = false

fun Boolean.toBinary(): Int{
    return if (this) 1
    else 0
}

//fun main() {
//    flag.toBinary()
//}