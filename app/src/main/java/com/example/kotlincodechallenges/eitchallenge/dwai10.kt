package com.example.kotlincodechallenges.eitchallenge

fun checkIfCharsAreUnique(input: String): Boolean {
    val characters = mutableSetOf<Char>()
    input.forEachIndexed { index, c ->
        if (characters.isNotEmpty()) {
            if (c in characters) {
                return false
            } else {
                characters.add(c)
            }
        } else {
            characters.add(c)
        }
    }
    return true
}

fun main() {
    println(checkIfCharsAreUnique(ALPHABET))
    println(checkIfCharsAreUnique(NONPHABET))
}