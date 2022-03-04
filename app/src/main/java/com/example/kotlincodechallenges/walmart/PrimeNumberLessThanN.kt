package com.example.kotlincodechallenges.walmart

fun main() {
//    println("Prime Numbers: ${primeNumbersLessThan(10)}")
//    findPrimeSum(10)
    isPrimeNumber(10)
}

// Todo not finished
fun primeNumbersLessThan(n: Int): Int {
    var result = 0

    for(i in 2..n) {
        if (i % 2 != 0) {
            result += i
            println("Prime Number: $i")
        }
    }
    return result
}
fun findPrimeSum(num : Int) {
    var result = 0

    for (i in 2..num) {
        var p = 1
        var k = 2
        while (k < i) {
            if (i % k == 0) {
                p = 0
                break
            }
            k++
        }
        if (p == 1) {
            result += i
        }
    }
    println("Result: $result")
}

fun isPrimeNumber(number: Int) {

    var result = 0
    for (i in 2..number / 2) {
        if (number % i == 0) {
            result += i
            println("Prime Number: $i")
        }
    }
    println("Result: $result")
}