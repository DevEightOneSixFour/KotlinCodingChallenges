package com.example.kotlincodechallenges.wellsfargo
/*
Q2. The program shall be provided with two arrays. arrOne and arrTwo, of type Integer.
    Determine the numbers that lie between the highest number in arrOne and smallest number
    in arrTwo that satisfy the following conditions:
	1.	The number should be a multiple of all elements in arrOne
	2.	The number should be a factor of all elements in arrTwo

Example
arrOne = [4, 8, 2, 6]
arrTwo = [96, 192, 144]

Highest number in arrOne = 8
Smallest number in arrTwo = 96
All potential numbers that can be considered: 9, 10, 11, 12 ……………. 91, 92, 93, 94,95 (exclusive range)
Numbers from the above list that satisfy the conditions (a) and (b): 24, 48
Hence, [24, 48] is the solution to the problem
 */

fun main() {
    val arrayOne = intArrayOf(4,8,2,6)
    val arrayTwo = intArrayOf(96,192,144)
    betweenTwoSets(arrayOne, arrayTwo)
}

fun betweenTwoSets(ar1: IntArray, ar2: IntArray) {

    val highestOne = ar1.maxOrNull()
    val lowestTwo = ar2.minOrNull()
    val resultList = mutableListOf<Int>()

//    for (i in highestOne!!..lowestTwo!!) {
//        if ()
//    }
}