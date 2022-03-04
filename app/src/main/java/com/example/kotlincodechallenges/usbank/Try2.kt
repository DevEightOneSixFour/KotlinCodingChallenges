package com.example.kotlincodechallenges.usbank

fun main() {

    val intArray = intArrayOf(1,2,3)

    println(maxProductArray(intArray))
//    maxAndProduct(intArray)

}

fun maxProductArray(a: IntArray): Int {
    val n = a.size
    val set = HashSet<Int>()
    if (n == 0) {
        return -1
    }
    var minProd = a[0]
    var maxProd = a[0]
    var answer = a[0]
    var choice1: Int
    var choice2: Int
    for (i in 0 until n) {
        choice1 = minProd and a[i]
        choice2 = maxProd and a[i]
        minProd = a[i].coerceAtMost(choice1.coerceAtMost(choice2))
        maxProd = a[i].coerceAtLeast(choice1.coerceAtLeast(choice2))
        answer = answer.coerceAtLeast(maxProd)
    }
    return answer
}

fun maxAndProduct(a: IntArray) {
    for (i in a.indices) {
        var start = a[i]
        var end = a[i]

        var movement = 1

        while (start != end) {
            start.shr(1)
            end.shr(1)
            movement.shl(1)
        }

        println("Start: $start")
        println("End: $end")
        println("Result: " + (start * movement))
    }
}

