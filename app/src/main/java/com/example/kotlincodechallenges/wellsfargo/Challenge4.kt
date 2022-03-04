package com.example.kotlincodechallenges.wellsfargo

// Write down logic in Kotlin
//    for removing similar repeated characters with alternate case
//   Example ->   aAbBcC  -  “”
//                abcCde  - abde
//                AbbCdDe -> Abbce

fun main() {

    println("First: ${removeRepeatingCapitals("aAbBcC")}")
    println("Second: ${removeRepeatingCapitals("abcCde")}")
    println("Third: ${removeRepeatingCapitals("AbbCdDe")}")
}

fun removeRepeatingCapitals(sequence: String): String {

    var temp = ""
    var count = -1
    sequence.forEach {
        if (it.isLowerCase() || count == -1) {
            temp += it
            count++
        } else if (it.equals(temp[count], ignoreCase = true)) {
            temp = temp.replace(temp.last(),' ').trim()
            count--
        }

    }
    return temp
}