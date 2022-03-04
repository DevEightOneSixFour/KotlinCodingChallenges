package com.example.kotlincodechallenges.wellsfargo

fun main() {
    sumUpToThis(7)
}

fun sumUpToThis(num: Int) {
    var result = 0

    for (i in 1 until num) {
        result+= i
        println("Current Number: $i")
    }
    println("Total: $result")
}