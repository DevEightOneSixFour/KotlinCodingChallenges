package com.example.kotlincodechallenges

fun main() {
    //println(descrambler("cdabfefacce"))
    println(sumBitAnd(arrayOf(1, 2, 3)))
    println(sumBitAndFromAnibal(arrayOf(1,2,3)))
    //println(reverseWord("abcde"))
//    println(reverseSentence("What did I tell you about coding you dope"))
    println(moveZerosToBack(intArrayOf(0, 0, 1, 2, 0, 5, 0, 1, 1, 0, 5)))
}

fun moveZerosToBack(arr: IntArray): String {
    var modifiedArr = Array<Int>(arr.size) { _ -> 0 }
    return modifiedArr.toString()
}

fun sumBitAndFromAnibal(arr: Array<Int>): Long {
    var result = 0L

    for (i in arr) {
        for (j in arr) {
            result += i * j
        }
    }

    return result
}

fun sumBitAnd(arr: Array<Int>): Long {
    var sum = 0L
    val hashSet = mutableSetOf<Int>()

    /*
        0000 -> 0
        0001 -> 1
        0010 -> 2
        0011 -> 3
        0100 -> 4
        0101 -> 5
        0110 -> 6
        0111 -> 7
        1000 -> 8
        1001 -> 9
     */

    for (i in arr) {
        for (j in arr) {
            if (i < j) {
                println("Set contains: $j")
                continue
            } else {
                sum += i and j
                println("I: $i")
                println("J: $j")
                println("Sum: $sum")
            }
        }
    }
    println("1 and 1: ${1 and 1}")
    println("1 and 2: ${1 and 2}")
    println("1 and 3: ${1 and 3}")
    println("2 and 2: ${2 and 2}")
    println("2 and 3: ${2 and 3}")
    println("3 and 3: ${3 and 3}")
//    println("1 and 4: ${1 and 4}")
//    println("4 and 4: ${4 and 4}")

    return sum
}

/*
    2

 */

fun reverseSentence(s: String): String {
    val words = s.split(" ")
    var reversedSentence: String = ""
    for (w in words) {
        reversedSentence += reverseWord(w)
        reversedSentence += " "
    }
    return reversedSentence.trim()
}


fun reverseWord(s: String): String {
    var charArray = CharArray(s.length)
    val len = s.length - 1
    for (i in len downTo 0) {
        charArray[i] = s[len - i]
    }
    return charArray.joinToString("")
}
