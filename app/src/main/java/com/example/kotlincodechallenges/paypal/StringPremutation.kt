package com.example.kotlincodechallenges.paypal

// Java program to print all permutations of a
// given string.

fun main() {
    val str = "ABC"
    val n = str.length
    val permutation = Permutation()
    permutation.permute(str, 0, n - 1)
}

class Permutation {
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    fun permute(str: String, l: Int, r: Int) {
        var str = str
        if (l == r) println(str) else {
            for (i in l..r) {
                str = swap(str, l, i)
                permute(str, l + 1, r)
                str = swap(str, l, i)
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    fun swap(a: String, i: Int, j: Int): String {
        val temp: Char
        val charArray = a.toCharArray()
        temp = charArray[i]
        charArray[i] = charArray[j]
        charArray[j] = temp
        return String(charArray)
    }
}

// This code is contributed by Mihir Joshi

