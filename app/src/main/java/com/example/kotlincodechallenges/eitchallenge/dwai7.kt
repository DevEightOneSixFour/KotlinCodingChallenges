package com.example.kotlincodechallenges.eitchallenge

// pass
private fun hasAllUniqueCharacters(input: String): Boolean {
    var charCount = HashMap<Char, Int>()
    input.forEach {
        var ch = it
        if (charCount.containsKey(ch)) {
            var count = charCount[ch]!!
            count++
            charCount[ch] = count
        } else {
            charCount[ch] = 1
        }
    }
    return input.length == charCount.size
}

fun main() {
    val input = "abbc"
    val result = hasAllUniqueCharacters(input)
    println(result)
    val result2 = hasAllUniqueCharacters(ALPHABET)
    println(result2)
}

