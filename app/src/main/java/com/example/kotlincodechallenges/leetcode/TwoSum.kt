package com.example.kotlincodechallenges.leetcode

import java.util.HashMap




fun main() {
    val intArray = intArrayOf(3, 3)

    println(twoSum2(intArray, 6))

}

fun twoSum(nums: IntArray, target: Int): IntArray? {

    val newMap = hashMapOf<Int, Int>()

    var complement = 0

    // loop to check every element in the array
    for (i in nums) {
        complement = target - nums.indexOf(i)

        // if we already have the complement in HashMap,
        // return an array that contain indices of them.
        if (newMap.containsKey(complement)) {
            return intArrayOf(i, newMap[complement]!!)
        }

        // if its complement is not in HashMap but in the array,
        // they will be matched when the complement is
        // regarded as current element
        // add current element into HashMap.
        newMap[nums.indexOf(i)] = i
    }

    return null
}

fun printArray(input: IntArray) {
    println("${input[0]} ${input[1]}")
}

fun twoSum2(nums: IntArray, target: Int) {
    val map = HashMap<Int, Int>()
    var complement: Int
    //loop to check every element in the array
    for (i in nums.indices) {
        complement = target - nums[i]
        //if we already have the complement in HashMap,
        //return an array that contains indices of them.
        if (map.containsKey(complement)) {
            printArray(intArrayOf(map[complement]!!,i ))
        }
        //if its complement is not in HashMap but in the array,
        //they will be matched when the complement is
        //regarded as current element.
        //add current element into HashMap.
        map[nums[i]] = i
    }
}

fun twoSum3(nums: IntArray, target: Int): IntArray {

    val map = hashMapOf<Int, Int>()
    var result = IntArray(2)
    nums.forEachIndexed{
            index, value ->
        if(map.containsKey(target - value)){
            result =  intArrayOf(index, map[target - value]!!)
        }
        map[value] = index
    }
    return result
}