package com.example.kotlincodechallenges.wellsfargo

fun main() {
    println(getLowsAndHighs(listOf(34, 28, 11, 21, 3, 34, 8, 7, 34, 7, 31, 7, 3, 28, 18)))
    println(sameButWithArray(arrayOf(34, 28, 11, 21, 3, 34, 8, 7, 34, 7, 31, 7, 3, 28, 18)))
    println()
}



fun getLowsAndHighs(list: List<Int>): Int {
    val newArray = intArrayOf(1,2,3,4,5)

    var count = 0
    val temp: List<Int> = list.sorted()

    for(num in temp) {
        if (num == temp[0]) {
            count++
        } else break
    }

//    temp = temp.sortedDescending()

    for(num in temp.asReversed()) {
        if (num == temp[temp.size - 1]) {
            count++
        } else break
    }

    return count
}

fun sameButWithArray(array: Array<Int>): Int {
    var count = 0

    array.sort()
    for (num in array) {
        if (num == array[0]) {
            count++
        } else break
    }
//
//    array.sortDescending()
    for (num in array.reversedArray()) {
        if (num == array[array.size - 1]) {
            count++
        } else break
    }

    return count
}