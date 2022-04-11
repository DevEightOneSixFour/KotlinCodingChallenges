package com.example.kotlincodechallenges.aeg

import kotlin.system.measureNanoTime

/*
    Implement a function which accepts two parameters
        the array and a key of type Integer and performs binary search
    Return the key if it exists or null if the key does not exist in the array
 */

fun main() {
    // array of 10 integers
    val numbers = listOf(2, 5, 6, 7, 10, 23, 45, 100, 200, 300)
    val key = 200

//    val newList = intArrayOf(2, 5, 6, 7, 10, 23, 45, 100, 200, 300)
//    newList.filter { it > 0 }
    searchWithKtFuns(numbers, key)
    println(searchWithBS(numbers, key))
}

fun search(list: List<Int>, key: Int): Int? {

    return if ((list.size == 1 && key != list[0]) || list.isEmpty()) {
        println("Item does not exist")
        null
    } else {
        val pivot = list.size / 2
        when {
            key == list[pivot] -> {
                print("Key found")
                key
            }
            key > list[pivot] -> {
                println("Key is larger")
                println("Current pivot -> ${list[pivot]}")
                search(list.takeLast(list.size - pivot), key)
            }
            key < list[pivot] -> {
                println("Key is smaller")
                println("Current pivot -> $pivot")
                search(list.take(pivot - 1), key)
            }
            else -> {
                println("Item does not exist")
                null
            }
        }
    }
}

fun searchWithKtFuns(list: List<Int>, key: Int): Int? {

    var n: Int? = 0

    val ms = measureNanoTime {
        if ((list.size == 1 && key != list[0]) || list.isEmpty()) {
            println("Item does not exist")
           n = null
        } else {
            val pivot = list.size / 2
            when {
                key == list[pivot] -> {
                    print("Key found")
                    n = key
                }
                key > list[pivot] -> {
                    println("Key is larger")
                    println("Current pivot -> ${list[pivot]}")
                    searchWithKtFuns(list.takeLast(list.size - pivot), key)
                }
                key < list[pivot] -> {
                    println("Key is smaller")
                    println("Current pivot -> $pivot")
                    searchWithKtFuns(list.take(pivot - 1), key)
                }
                else -> {
                    println("Item does not exist")
                    n = null
                }
            }
        }
    }
    println("searchWithKTFuns -> ${ms}ns")
    return n
}

fun searchWithBS(list: List<Int>, key: Int): Int? {
    println("----With BS----")
    var n = 0
    val ms = measureNanoTime {
        n = list.binarySearch(key)
    }
    println("searchWithBS -> ${ms}ns")
    return n
}

/*
                201
    2, 5, 6, 7, 10, 23, 45, 100, 200, 300

    2, 5, 6, 7, 10, [23], 45, 100, 200, 300

            200
    23, 45 [100] 200, 300

            201
        100 | 200, 300
            201
        200 | 300

        201
        200
 */