package com.example.kotlincodechallenges

fun main() {
    val n = 10
    fibonacciForLoop(n)
    fibonacciWhileLoop(n)
//    println(fibonacciWithSequence(n).joinToString("|"))
}

fun fibonacciForLoop(n: Int) {
    var n1 = 0
    var n2 = 1

    println("---First $n terms---")
    for (i in 1..n) {
        print("$n1 | ")

        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }
}

fun fibonacciWhileLoop(n: Int) {
    var n1 = 0
    var n2 = 1
    var count = 0
    println("---First $n terms---")
    while (count <= n) {
        print("$n1 | ")

        val sum = n1 + n2
        n1 = n2
        n2 = sum

        count++
    }
}
fun fibonacciWithSequence(n: Int) = sequence {
    var terms = Pair(0, 1)
    var count = 1
    while (count < n) {
        yield(terms.first)
        terms = Pair(terms.second, terms.first + terms.second)
        println("Prev: ${terms.first} -- Curr: ${terms.second}")
        count++
    }
}