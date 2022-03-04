package com.example.kotlincodechallenges.tbd

/*
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

//Find the 3 largest prime numbers in this list
//8,18,22,15,5,2,3,12,7,17,9,31,72,73

fun main() {
    val myArray = arrayListOf(8,18,22,15,5,2,3,12,7,17,9,31,72,73)
    val newArray = emptyArray<Int>()
    for(number in myArray) {
        for(i in 2.toLong()..number/2) {

        }
    }
    println(myArray)
}



Iñaki, 5:21 PM
//Find the 3 largest prime numbers in this list
//8,18,22,15,5,2,3,12,7,17,9,31,72,73

fun main() {
    val myArray = arrayListOf(8,18,22,15,5,2,3,12,7,17,9,31,72,73)
    val primeNumbers = mutableListOf<Int>()

    for(number in myArray) {
       if(checkForPrime(number.toLong())) {
           primeNumbers.add(number)
       }
    }

    println(primeNumbers.sortedDescending().take(3))
}

fun checkForPrime(number: Long): Boolean {
    if(number < 2) return false
    for(i in 2.toLong()..number /2) {
        if(number % i == 0.toLong()) {
            return false
        }
    }
    return true
}
 */