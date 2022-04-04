package com.example.kotlincodechallenges
/*
Given a string s, change the string s according to the rules provided below:

Delete all the vowels from the string.
Insert # in front of all the consonants.
Change the case of all the letters of the string.

Examples:
Input : aBAcAba
Output :#b#C#B

Input :SunshinE!!
Output :#s#N#S#H#N!!

 */
const val vowels = "aAeEiIoOuU"
fun main() {
    hashString("aBAcAba")
    hashString("SunshinE!!")
}

fun hashString(s: String) {
    val builder = StringBuilder()

    for (c in s) {
        if (!c.isLetter()) builder.append(c)
        else if (!c.isVowel()) builder.append("#${c.flipCase()}")
    }
    println(builder.toString())
}

fun Char.isVowel() = (vowels.contains(this))

fun Char.flipCase(): Char {
    return if (this.isUpperCase()) this.lowercaseChar()
    else this.uppercaseChar()
}