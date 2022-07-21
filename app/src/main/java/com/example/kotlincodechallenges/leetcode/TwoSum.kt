package com.example.kotlincodechallenges.leetcode

import java.util.HashMap

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists
 */
fun main() {
    val intArray1 = intArrayOf(2,7,11,15)
    val intArray2 = intArrayOf(3,2,4)
    val intArray3 = intArrayOf(3, 3)

//    println(twoSum(intArray1, 9))
//    println(twoSum(intArray2, 6))
//    println(twoSum(intArray3, 6))
    //
    println(twoSum2(intArray1, 9))
    println(twoSum2(intArray2, 6))
    println(twoSum2(intArray3, 6))
    //
    println(twoSum3(intArray1, 9))
    println(twoSum3(intArray2, 6))
    println(twoSum3(intArray3, 6))

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

fun twoSum3(nums: IntArray, target: Int): String {

    val map = hashMapOf<Int, Int>()
    var result = IntArray(2)
    nums.forEachIndexed{
            index, value ->
        if(map.containsKey(target - value)){
            result =  intArrayOf(index, map[target - value]!!)
        }
        map[value] = index
    }
    return result.joinToString(",")
}