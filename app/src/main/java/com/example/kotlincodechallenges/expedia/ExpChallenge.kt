package com.example.kotlincodechallenges.expedia

/*
Min and Max Value
Given five positive integers, find the minimum and maximum values that can be calculated
by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two
space-separated long integers.

Example

The minimum sum is and the maximum sum is. The function prints
16 24

Function Description
Complete the miniMaxSum function in the editor below.
miniMaxSum has the following parameter(s):
	•	arr: an array of integers
Print
Print two space-separated integers on one line: the minimum sum and the maximum sum of elements.
Input Format
A single line of five space-separated integers.
Constraints
Output Format
Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
Sample Input
1 2 3 4 5
Sample Output
10 14
Explanation
The numbers are , , , , and . Calculate the following sums using four of the five integers:
	•	Sum everything except , the sum is .
	•	Sum everything except , the sum is .
	•	Sum everything except , the sum is .
	•	Sum everything except , the sum is .
	•	Sum everything except , the sum is .
Hints:Beware of integer overflow! Use 64-bit Integer.

 */

fun main(){
    println(miniMaxSum(listOf(1,2,3,4,5)))
    println(miniMaxSum(listOf(1,7,2,3,4,5,6)))
    println(miniMaxSumArray(intArrayOf(1,2,3,4,5)))
    println("From Ken ${miniMaxFromKen(intArrayOf(1,2,3,4,5))}")
    println("From Ken ${miniMaxFromKen(intArrayOf(1,7,2,3,4,5,6))}")
}

fun miniMaxSum(input: List<Int>): String{
    var minResult = 0L
    var maxResult = 0L
    val sorted = input.sorted()

    (0 until input.lastIndex).forEach{ minResult += sorted[it]}
    (1 until input.size).forEach{ maxResult += sorted[it]}

    return "$minResult $maxResult"
}

fun miniMaxSumArray(input: IntArray): String{
    var minResult = 0L
    var maxResult = 0L
    val sorted = input.sorted()

    (0 until input.lastIndex).forEach{ minResult += sorted[it]}
    (1 until input.size).forEach{ maxResult += sorted[it]}

    return "$minResult $maxResult"
}

fun miniMaxFromKen(input: IntArray): String {
    /*
       getting values for the min, max and total
     */
    var min = input[0] // just a number to follow
    var max = 0 // make it zero since we are looking for the max
    var total = 0

    /*
        We will iterate through the array
        When the current number is less than the the min we save it
        And the opposite for the max
     */
    input.forEach { num ->
        //Every iteration we add to the total
        total += num

        // getting the max and min here
        when {
            num < min -> min = num
            num > max -> max = num
        }
    }
    // The min will equal the total - the max 15 - 5 = 10
    // The max will equal the total - the min 15 - 1 = 14
    return "Min -> ${total - max} \n" +
            "Max -> ${total - min}"
}