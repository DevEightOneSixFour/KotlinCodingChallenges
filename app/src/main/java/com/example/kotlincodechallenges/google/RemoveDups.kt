package com.example.kotlincodechallenges.google


fun main() {
    val array = intArrayOf(1,2,1,1,1,1,1,1,1,3,4,5,6,6,7,2,13,4,7,4,32,9)
    println(removeDuplicatedElements(array))
    println(getDifference(array))
}
// Remove duplicated items from int array
fun removeDuplicatedElements(arr: IntArray?): String? {
    println("Original: \n${arr?.joinToString(",")}")
    if (arr == null) {
        return null
    }
    val n = arr.size
    var j = 0
    for (i in 0 until n - 1) {
        if (arr[i] != arr[i + 1]) {
            arr[j++] = arr[i]
        }
    }
    arr[j++] = arr[n - 1]
    println("Dups removed:")
    return arr.joinToString(",")
}

// largest vs smallest difference in the array
fun getDifference(arr: IntArray?): String {
    if (arr == null) {
        return "Nothing"
    }
    if (arr.isEmpty()) {
        return "Nothing"
    }
    var min = arr[0]
    var max = arr[0]
    var i = 1
    while (i < arr.size) {
        if (arr[i] < min) {
            min = arr[i]
        }
        if (arr[i] > max) {
            max = arr[i]
        }
        i++
    }
    return "Min:$min \nMax:$max\nDifference:${max - min}"
}

