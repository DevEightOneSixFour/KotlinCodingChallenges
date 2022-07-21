package com.example.kotlincodechallenges

// Find the pair numbers in the array that match the sum
fun main() {
    val target = 10
    val nums = intArrayOf(8, 7, 2, 5, 3, 1, 8, 7, 2, 5, 3, 1)
    findPairsOfSum(nums, target)
}

fun findPairsOfSum(nums: IntArray, target: Int) {
    val map = HashMap<Int, Int>()
    var result = ""

    for (i in nums.indices) {

        // check if pair (nums[i], target - nums[i]) exists
        // if the difference is seen before, print the pair
         if (map.containsKey(target - nums[i]) && map.containsKey(nums[i])) {
            // so later duplicate pairs are not shown
            continue
        } else if (map.containsKey(target - nums[i]) || (nums[i] + nums[i]) == target) {
            // TODO print pairs that equal the sum 5,5 -> 10 || 3,3 -> 6
            result += "Pair found (${(target - nums[i])},${nums[i]})\n"
        }

        // store index of the current element in the map
        map[nums[i]] = i
    }

    if (result == "") {
        println("No pairs found")
    } else {
        println(result)
    }
}
/*
 since we are looking for pairs the make the target
 first checking it the current number minus the target
 is in the map (For example, 10 - 2 = 8, if 8 is in the map, then pair exists)
 after the check, we are going to add the current number to the map
 */
