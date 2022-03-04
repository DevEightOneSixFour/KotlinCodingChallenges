package com.example.kotlincodechallenges.walmart

val dictionary = arrayOf(
    "mobile", "samsung", "sam", "sung",
    "man", "mango", "icecream", "and",
    "go", "i", "like", "ice", "cream"
)
val dictionary2 = arrayOf("apple", "pen")
val dictionary3 = arrayOf("cats", "dog", "sand", "cat")
fun main() {
    // dictionary
//    println(wordBreak("ilikesamsung"))
//    println(wordBreak("iiiiiiii"))
//    println(wordBreak(""))
//    println(wordBreak("ilikelikeimangoiii"))
//    println(wordBreak("samsungandmango"))
//    println(wordBreak("samsungandmangok"))

    //dictionary2
//    println(wordBreak("applepenapple"))

    // dictionary3
    println(wordBreak("catsandog"))
}

fun wordBreak(word: String): Boolean {
    if (word.isEmpty()) {
        return true
    }

    for (i in word.indices) {

        // Now we will first divide the word into two parts ,
        // the prefix will have a length of i and check if it is
        // present in dictionary. If yes then we will check for
        // suffix of length size-i recursively. If both prefix and
        // suffix are present the word is found in dictionary.

        if (dictionary3.contains(word.substring(0,i+1)) &&
               wordBreak(word.substring(i+1, word.length))
        ) {
            return true
        }
    }
    return false
}