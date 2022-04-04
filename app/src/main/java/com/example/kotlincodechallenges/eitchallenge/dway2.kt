package com.example.kotlincodechallenges.eitchallenge

fun main() {
    println(identifyUniqueCharacter("abc")) // true
    println(identifyUniqueCharacter("abba")) // false
}
fun identifyUniqueCharacter(input: String): Boolean{

    var charcters = input.toCharArray()
    var isTrue = false
    for (index in charcters.indices){
        for (index2 in charcters.indices){
            isTrue = charcters[index].toString() == charcters[index2].toString()
            println("index1: ${charcters[index]}")
            println("index2: ${charcters[index2]}")
            if (isTrue) break
        }
        if (isTrue) break

    }
    return isTrue
}

