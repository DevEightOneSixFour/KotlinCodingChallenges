package com.example.kotlincodechallenges.etrade

// For each value in array B,
// how many values in array A are less than that value in array B
// println(getComparedList(listOf(1,2,3), listOf(4,5)))
// should return [3, 3]
fun main() {
    println(getComparedList(listOf(1,2,3), listOf(4,5)))
    println(getComparedList(listOf(4, 10), listOf(6, 7)))
    println(getComparedList(listOf(3, 4, 5, 6), listOf(2, 3, 4)))
    println(getComparedList(listOf(1, 2, 2, 9), listOf(3, 4, 9)))
    println(getComparedList(listOf(5, 6, 8, 9), listOf(2, 3, 4)))
}

fun getComparedList(list1: List<Int>, list2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    list2.forEach { currentIndexList2 ->
        var count = 0
        list1.forEach { currentIndexList1 ->
            if (currentIndexList2 >= currentIndexList1) {
                count++
            }
        }
        result.add(count)
    }

    return result
}

/*
Risebird coding discussion
1. Write syntax of Visibility Modifiers, Sealed Classes, Extension function, Generics in Kotlin

// Generic
Class GenericState<T>() {

}

sealed class UiState(): GenericState<User> {
  object Loading: UiState()

  // Adding modifiers, extensions and generics
  class Success(user: User): UiState() {
    // Extension
    fun String.getFullName() = user.firstName + “ “ + user.lastName

    // Modifiers
    // state is a mutable far into User object
    fun updateSession(state: String) {
      user.state = state
    }
  }
}

2. Write code for implementing constructor in Kotlin

class Person(name: String) {

  construactor(gender: String): super(name) {
    // Implementation of secondary constructor
  }

  Init {
    // Implementation of primary constructor
  }
}

3. Write code for thread safe  singleton in Java ?

class Singleton {
  Private Helper helper;

  Public synchronized Helper getHelper() {
    If (helper == null) {
      helper = new Helper();
    }
    return helper;
  }
}

4. Write down logic in Java for removing similar repeated characters with alternate case
    aAbBcC  -  “”
    abcCde   - abde


fun getUniqueChars(text: String): String {
    val uniqueChars = HashSet()
    text.map { char ->
      uniqueChars.add(char)
    }
    return uniqueChars.toString()
}
 */