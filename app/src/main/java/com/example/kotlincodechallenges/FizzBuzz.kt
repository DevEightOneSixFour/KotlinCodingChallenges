package com.example.kotlincodechallenges

import java.lang.StringBuilder
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main() {
    val n = 100

    fizzBuzz(n)
}

fun fizzBuzz(n: Int) {

   val stringMillis = measureNanoTime {
       for (i in 1..n) {
           var output = ""

           if (i % 3 == 0) output += "Fizz"
           if (i % 5 == 0) output += "Buzz"

           if (output == "") println(i)
           else println(output)
       }
   }

    val stringBuilderMillis = measureNanoTime {
        for (i in 1..n) {
            val output = StringBuilder()

            if (i % 3 == 0) output.append("Fizz")
            if (i % 5 == 0) output.append("Buzz")

            if (output.isEmpty()) println(i)
            else println(output)
        }
    }

    val stringBufferMillis = measureNanoTime {

        for (i in 1..n) {
            val output = StringBuffer()

            if (i % 3 == 0) output.append("Fizz")
            if (i % 5 == 0) output.append("Buzz")

            if (output.isEmpty()) println(i)
            else println(output)
        }
    }

    println("String ${stringMillis}ns")
    println("StringBuilder ${stringBuilderMillis}ns")
    println("StringBuffer ${stringBufferMillis}ns")

    val int = "12345"
    val intList = int.toList()
    val mutableList = mutableListOf<Int>()
    println(intList)

//    for (i in intList) {
//        mutableList.add(i.digitToInt())
//    }
//    val checkLeft = true
//    for(i in mutableList.indices) {
//        if (i != mutableList.lastIndex) {
//            if ()
//        }
//    }


}