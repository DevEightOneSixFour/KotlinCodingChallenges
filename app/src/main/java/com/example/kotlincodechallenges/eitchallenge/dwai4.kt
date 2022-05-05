package com.example.kotlincodechallenges.eitchallenge

// fail
var value: String = ""
fun main() {
    value = "abba"
    println(findUniqueCharacter(value as List<String>))
    value = "abcd"
    println(findUniqueCharacter(value as List<String>))
    value = "abcdefghijklmnopqrstuvwxyz"
    println(findUniqueCharacter(value as List<String>))

}

fun findUniqueCharacter(value: List<String>): Boolean {
    val uniqueValue = value.distinct()
    return uniqueValue.size == value.size
}
