package com.example.kotlincodechallenges

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis


//Convertion:
//[a,A]-> 4
//[e,E]-> 3
//[i,I]-> 1
//[o,O]-> 0
//[s,S]-> 5
//[t,T]-> 7
//
//Input/Output
//Android is better that iOS -> 4ndr01d 15 b3773r 7h47 105
//This is a test -> 7h15 15 4 7357

fun main() {
    l33tC0d3("Android is better that iOS")
    println(convertPhrase("Android is better that iOS"))
    println(dupsOrNaw("Andro     "))
}

val mem = Runtime.getRuntime()
val memBefore = mem.totalMemory() - mem.freeMemory()
fun l33tC0d3(input: String) {
    println("Original: $input")
    var temp = ""
    val temp2 = StringBuilder()
    val time = measureNanoTime {

        println("String+= Memory Used Before: $memBefore")
        for (c in input) {
            temp += when (c) {
                'A', 'a' -> '4'
                'E', 'e' -> '3'
                'I', 'i' -> '1'
                'O', 'o' -> '0'
                'S', 's' -> '5'
                'T', 't' -> '7'
                else -> c
            }
        }
        val memAfter = mem.totalMemory() - mem.freeMemory()
        println("String+= Memory Used After: ${memAfter - memBefore}")
    }




    val mem2 = Runtime.getRuntime()
    val memBefore2 = mem2.totalMemory() - mem2.freeMemory()
    val time2 = measureNanoTime {

        println("StringBuilder Memory Used Before: $memBefore2")
        for (c in input) {
            temp2.append(
                when (c) {
                    'A', 'a' -> '4'
                    'E', 'e' -> '3'
                    'I', 'i' -> '1'
                    'O', 'o' -> '0'
                    'S', 's' -> '5'
                    'T', 't' -> '7'
                    else -> c
                }
            )
        }
        val memAfter2 = mem2.totalMemory() - mem2.freeMemory()
        println("StringBuilder Memory Used After: ${memAfter2 - memBefore2}")
    }
    println("L337 5p34k: $temp")
    println("Time: ${time}ns")
    println("Time2: ${time2}ns")
}

fun convertPhrase(input: String): String {
    val result = StringBuilder()
    // Iterate over the char array
    for (index in 0 until input.length) {
        // Get the current letter in the index position
        // to be analyzed
        var currentChar = input[index]
        // Check current letter if it match the case
        when (currentChar.uppercaseChar()) {
            'A' -> {
                result.append("4")
            }
            'E' -> {
                result.append("3")
            }
            'I' -> {
                result.append("1")
            }
            'O' -> {
                result.append("0")
            }
            'S' -> {
                result.append("5")
            }
            'T' -> {
                result.append("7")
            }
            else -> {
                result.append(currentChar)
            }
        }
    }

    return result.toString()
}

/*
Implement an algorithm to determine if a string has all unique characters
"abc" = true
"abba" = false
 */

fun dupsOrNaw(string: String): Boolean {
    val set = mutableSetOf<Char>()
    for (c in string) {
        if (c == ' ') {
            continue
        } else if (!set.contains(c)) {
            set.add(c)
        } else {
            return false
        }
    }
    return true
}