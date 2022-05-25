package com.example.kotlincodechallenges.firstrepublicbank

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

/*
 * fun main() {
    val n = 7
    System.out.println("Part 1: " + fibonacci(n))
    //System.out.println("Part 2: " + fibonacciPartTwo(n))
}
fun fibonacci(n: Int): String {



return sequence
}
 *
 * */
fun main() {
    val n = 7
    println("Part 1: ${fibonacci(n)}")
    println("Part 2: ${fibonacciPartTwo(n)}")
}

private fun fibonacciPartTwo(n: Int): String {
    var n1 = 0
    var n2 = 1
    var total = 0

    total += n1
    total += n2

    for (index in 1..n) {
        var sum = n1 + n2
        n1 = n2
        n2 = sum

        total += sum
    }
    return "$total"
}

private fun fibonacci(n: Int): String {
    var n1 = 0
    var n2 = 1
    var sb = StringBuilder()

    sb.append("$n1").append(" ")
    sb.append("$n2").append(" ")

    for (index in 1..n) {
        var sum = n1 + n2
        n1 = n2
        n2 = sum

        sb.append("$sum").append(" ")
    }
    return sb.toString()
}

