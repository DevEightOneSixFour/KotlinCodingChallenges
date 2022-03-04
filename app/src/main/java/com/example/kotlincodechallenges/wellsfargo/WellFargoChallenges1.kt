package com.example.kotlincodechallenges.etrade


/*
1. Write syntax of Visibility Modifiers,
    Sealed Classes, Extension function, Generics in Kotlin
2. Write code for implementing Secondary constructor in Kotlin
3. Write code for thread safe singleton in Java
4. Write down logic in Kotlin
    for removing similar repeated characters with alternate case
 */
fun main() {

}

abstract class Engine {
    val string = ""
    open fun start() {
        print("Start")
    }
}

// #1
class Gas : Engine() {
    override fun start() {
        string.plus("09")
    }
}
sealed class State {
    data class Success(val dataModel: DataModel): State()
    data class Error(val message: String): State()
    object Loading: State()
}
data class DataModel(
    val id: Long,
    val name: String
)

/*
fun main(args: Array<String>) {
    do {
        val line = readLine()
        if (line != null) {
          println(reverseNumberPalindrom(line))
        }
    } while (line != null)
}

private fun reverseNumberPalindrom(line: String): String {
 val reversedNumber = StringBuilder(line).reversed()
  var sum = line.toInt()
  var count = 0
  var okay = true

  while(okay) {
    sum = sum.plus(reversedNumber.toString().toInt())
    if (isPalindrome(sum)) {
      okay = false
    } else {
      count++
    }
  }
  return "$count $sum"
}

private fun isPalindrome(number: Int): Boolean {
  var reverseNumber = 0
  var temp = number

  while (temp > 0) {
    val remainder = temp % 10
    reverseNumber = (reverseNumber * 10) + remainder
    temp = temp / 10
  }
  return number == reverseNumber
}
 */