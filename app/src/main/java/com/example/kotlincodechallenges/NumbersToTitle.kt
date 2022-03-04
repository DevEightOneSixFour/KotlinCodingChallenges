package com.example.kotlincodechallenges

//Write a program to find the title from a given number using the below rule.
//A-1
//B-2
//C-3
//D-4
//--
//--
//--
//Y-25
//Z-26
//
//input 27 o/p AA
//imput 54 o/p BB
//input 10000000000  o/p AFIPYQJP

fun main() {
    println(convertToTitle(12345678910L))
}

fun convertToTitle(columnNumber: Long): String {


    val mod = columnNumber%26
    val rem = columnNumber/26

    var result = (mod+64).toChar().toString()


    if(rem>0){
        result = convertToTitle(rem) + result
    }

    return  result
}