package com.example.kotlincodechallenges.eitchallenge

// pass
fun main() {
    val result1 = checkAllUnique(input = "abc")
    val result2 = checkAllUnique(input = "abba")
    val result3 = checkAllUnique(input = "anc")
    val result4 = checkAllUnique(input = "ancc")

    println(result1)
    println(result2)
    println(result3)
    println(result4)

}

private fun checkAllUnique(input: String) = input.allUnique()

private fun String.allUnique(): Boolean = toSet().size == length