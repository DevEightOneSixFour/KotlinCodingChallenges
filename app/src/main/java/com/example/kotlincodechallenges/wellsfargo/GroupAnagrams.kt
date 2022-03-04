package com.example.kotlincodechallenges.wellsfargo

import java.util.ArrayList

import java.util.Arrays

import java.util.HashMap




/*
Given an array of strings, group anagrams together.

Example
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Solution:
To solve this problem, we will maintain a map ans : {String -> List}
where each key K is a sorted string, and each value is the list of strings from
the initial input that when sorted, are equal to K.
 */

fun main() {
    val newArray = arrayOf("eat", "tea", "tan", "ate", "nat", "bat", "zxc")
    val listOfAList = groupAnagrams(newArray)
    listOfAList.forEach {first -> println(first)}
    println("-----")
    val listOfAList2 = groupAnagrams2(newArray)
    listOfAList2.forEach {first -> println(first)}
    println("-----")
    val listOfAList3 = groupAnagrams3(newArray)
    println(listOfAList3)
    println("-----")
//    val listOfAList4 = groupAnagrams4(newArray)
//    println(listOfAList4)
}

fun groupAnagrams(array: Array<String>): List<List<String>> {
    val newMap = hashMapOf<String,MutableList<String>>()

    array.forEach { char ->
        val newArray = char.toCharArray().sorted().joinToString()
        if (!newMap.containsKey(newArray)) newMap[newArray] = mutableListOf()
        newMap[newArray]?.add(char)
    }

    return newMap.values.toList()
}

fun groupAnagrams5(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, MutableList<String>>()
    strs.forEach {
        val key = it.toCharArray().sorted().joinToString("")
        if (!map.containsKey(key)) map[key] = mutableListOf()
        map[key]?.add(it)
    }

    return map.values.toList()
}

fun groupAnagrams6(strs: Array<String>): List<List<String>> {
    // Convert strings to a tuples of letter-count to string
    val charCounts = strs.map { charCount(it) to it }

    // Group tuples by their letter-count
    val groups = charCounts.groupBy { Arrays.hashCode(it.first) }

    // Extract only the strings from the grouped tuples
    val output =  groups.values.map { it.map { it.second } }
    return output
}

// Return array with the count of each letter of the alphabet
fun charCount(s: String): IntArray {
    val output = IntArray(26)
    for (c in s) {
        output[c.toInt() - 'a'.toInt()] += 1
    }
    return output
}

fun groupAnagrams2(strs: Array<String>): List<List<String>> {
    return strs.groupBy { it.toCharArray().sorted() }.map { it.value }
}

fun groupAnagrams3(strs: Array<String>): List<List<String>> = strs
    .groupBy { it.toCharArray().sorted().toString() }
    .values
    .toList()

//fun groupAnagrams4(strs: Array<String>): List<MutableList<String>> {
//    val map: MutableMap<String, MutableList<String>?> = HashMap()
//    for (i in strs.indices) {
//        val ch = strs[i].toCharArray()
//        Arrays.sort(ch)
//        val sortedtemp = String(ch)
//        if (map.containsKey(sortedtemp)) {
//            map[sortedtemp]!!.add(strs[i])
//        } else {
//            map[sortedtemp] = ArrayList()
//            map[sortedtemp]!!.add(strs[i])
//        }
//    }
//    return listOf(listOf(map.values))
//}