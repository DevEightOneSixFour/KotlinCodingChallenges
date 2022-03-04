package com.example.kotlincodechallenges.walmart

fun main() {
    pushZerosToEnd(intArrayOf(1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9))
}

fun pushZerosToEnd(array: IntArray) {
    var count = 0

    // Traverse the array. If element encountered is
    // non-zero, then replace the element at index 'count'
    // with this element
    for (i in array) {
        if (i != 0) {
            array[count++] = i
        }
    }
    // Now all non-zero elements have been shifted to
    // front and 'count' is set as index of first 0.
    // Make all elements 0 from count to end.
    while (count < array.size) array[count++] = 0

    println(array.joinToString())
}
