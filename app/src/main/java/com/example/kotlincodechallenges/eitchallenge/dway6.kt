package com.example.kotlincodechallenges.eitchallenge

//fun main(){
//    println(testString("abba"))
//    println(testString("abc"))
//}
//
//fun testString(str: String): Boolean {
//
//    str.forEach { it ->
//        val charMap = str.groupBy { it }
//        if(charMap[it]?.size ?: 0 > 0) {
//            return false
//        }
//    }
//    return true
//}

// part 2
fun main(){
    println(testString("aac"))
    println(testString(ALPHABET))
}

fun testString(str: String): Boolean {
    return str.length == str.chars().distinct().count().toInt()
}

const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"