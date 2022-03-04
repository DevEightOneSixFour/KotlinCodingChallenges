package com.example.kotlincodechallenges.microsoft

import java.util.*
import kotlin.collections.HashSet

// having a list of integer repeated numbers, find the unique number
fun main() {
    val array = intArrayOf(1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234,1,4,2,5,3,11231231,495343,584943939,5345234)
    val otherArray = intArrayOf(1,2,3)
    findUniqueNumbers(array)
    findDuplicates(array)
    findDuplicates(otherArray)
}

fun findUniqueNumbers(array: IntArray) {
    val set = HashSet<Int>()

    for (i in array) {
        if (!set.contains(i)) {
            set.add(i)
            println("Distinct Number: $i")
        }
    }
}

fun findDuplicates(array: IntArray) {
    val set : HashSet<Int> = array.toHashSet()

    /*
        since Set cannot contain duplicate the array size and
        HashSet size should match if all elements are unique
     */
    set.forEach {
        println(it)
    }
    if (set.size == array.size) {
        println("No duplicates found")
    } else {
        println("Duplicates found")
    }
}