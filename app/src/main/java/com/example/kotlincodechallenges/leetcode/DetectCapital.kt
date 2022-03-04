package com.example.kotlincodechallenges.leetcode

/*
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
 */
fun main() {
    val stringArray =
        arrayOf("USA", "leetcode", "Google", "NoTcOrReCt", "alsoNotCorrect", "ShouldFailToo")

    println(detectCapital(stringArray[0]))
    println(detectCapital(stringArray[1]))
    println(detectCapital(stringArray[2]))
    println(detectCapital(stringArray[3]))
    println(detectCapital(stringArray[4]))
    println(detectCapital(stringArray[5]))
}

fun detectCapital(word: String): Boolean {
    var caps = 0

    // count all of the capital letters
    for (i in word) {
        if (i.isUpperCase()) caps++
    }

    // see if the caps match the input length
    // or if there are no caps
    if (caps == word.length || caps == 0) {
        return true
    }

    // see if there is only one cap
    // if the first letter is capped
    return caps == 1 && word[0].isUpperCase()
}