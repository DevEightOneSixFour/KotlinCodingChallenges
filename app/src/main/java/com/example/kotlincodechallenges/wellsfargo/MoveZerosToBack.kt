package com.example.kotlincodechallenges.wellsfargo


fun main() {
    moveZerosToBackPls(intArrayOf(0,2,1,0,6,0,0,1,5,0,5,1234,6,9,0,9))
    moveZerosWithOutIndices(intArrayOf(0,2,1,0,6,0,0,1,5,0,5,1234,6,9,0,9))
    moveZerosWithOutIndices(intArrayOf(1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9))
    pushZerosToEnd(intArrayOf(0, 9, 8, 4, 0, 0, 2, 7, 1, 6, 0, 9))
}

fun moveZerosToBackPls(array: IntArray) {
    var count = 0 // count the non zeros

    for(i in array.indices) {
        if (array[i] != 0) {
            array[count++] = array[i]
            array[i] = array[count]
        }
    }
    println(array.joinToString())
}

fun moveZerosWithOutIndices(array: IntArray) {
    var count = 0 // count the non zeros

    for(i in 0..array.size-1) {
        if (array[i] != 0) {
            array[count++] = array[i]
            array[i] = array[count]
        }
    }

    println(array.joinToString())
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
