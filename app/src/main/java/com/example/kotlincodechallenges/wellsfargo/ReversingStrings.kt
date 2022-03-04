package com.example.kotlincodechallenges.wellsfargo

import com.example.kotlincodechallenges.reverseSentence
import java.math.BigInteger


fun main() {
    val string = "hello world"
//    reverseIt()
    println("\nOriginal: $string")
    println("Reverse Word: ${reverseWord(string)}")
    println("Reverse Words: ${reverseWords(string)}")
    println("Reverse Sentence: ${reverseSentence(string)}")
    println("Reverse Sentance: ${reverseSentance(string)}")
}

fun reverseIt() {
    val s = "Reverse String"
    val arr = s.split("".toRegex()).toTypedArray()
    for (i in arr.indices.reversed()) {
        print(arr[i])
    }
}

fun reverseSentance(str: String) : String {
    /* The split() method of String class splits * a string in several strings based on the * delimiter passed as an argument to it */
    val words = str.split(" ".toRegex()).dropLastWhile {
        it.isEmpty()
    }.toTypedArray()
    var reversedString = ""
    for (i in words.indices) {
        val word = words[i]
        var reverseWord = ""
        for (j in word.length - 1 downTo 0) {
            /* The charAt() function returns the character * at the given position in a string */
            reverseWord = reverseWord + word[j]
        }
        reversedString = "$reversedString$reverseWord "
    }
    return reversedString
}

fun reverseWord(s: String): String {
    // start at the end of the string
    // iterate and count until non alpha char
    // iterate until count back to end Of string
    // build forward string

//    val k = BigInteger("0.0", 7)
//    k.mo
    var scout = s.length - 1

    val builder = StringBuilder()
    var lettersCount = 0

    while (scout >= 0) {
        val char = s[scout]
        if (char != ' ') {
            lettersCount++
        } else if (lettersCount > 0) {
            var index = scout + 1 // start of the word
            while (index <= scout + lettersCount) { // until the end of the word
                builder.append(s[index])
                index++
            }
            scout++ // we don't need scout-- in this case, so just add one to counter scout-- at the end
            lettersCount = 0
        } else {
            if (builder.isNotEmpty()) {
                builder.append(' ')
            }
        }

        scout--
    }

    if (lettersCount > 0) { // loop might finish with some letters not added (can extract to a function)
        var index = scout + 1
        while (index <= scout + lettersCount) {
            builder.append(s[index])
            index++
        }
    }

    return builder.toString().trim()
}

fun reverseWords(s: String): String {
    // start at the end of the string
    // iterate and count until non alpha char
    // iterate until count back to end Of string
    // build forward string

    var scout = s.length - 1

    var builder = ""
    var lettersCount = 0

    while (scout >= 0) {
        val char = s[scout]
        if (char != ' ') {
            lettersCount++
        } else if (lettersCount > 0) {
            var index = scout + 1 // start of the word
            while (index <= scout + lettersCount) { // until the end of the word
                builder += s[index]
                index++
            }
            scout++ // we don't need scout-- in this case, so just add one to counter scout-- at the end
            lettersCount = 0
        } else {
            if (builder.length !=0) {
                builder += ' '
            }
        }

        scout--
    }

    if (lettersCount > 0) { // loop might finish with some letters not added (can extract to a function)
        var index = scout + 1
        while (index <= scout + lettersCount) {
            builder+= s[index]
            index++
        }
    }

    return builder.toString().trim()
}

fun reverseString(s: CharArray): String {
    var result = ""
    if (s.size == 0 || s.size == 1) return result
    var left = 0
    var right = s.lastIndex

    while(left < right) {
        s[left] = s[right]
            .also { s[right] = s[left] }
        left += 1
        right -= 1
    }
    return result
}