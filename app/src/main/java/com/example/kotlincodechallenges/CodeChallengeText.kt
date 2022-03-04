package com.example.kotlincodechallenges

import java.util.*

/*
    1. Write down logic in Kotlin for removing similar repeated characters with alternate case
        Example ->   aAbBcC  -  “”
                     abcCde  - abde
*/

/*
   2. With given array [34,28,11,21,3,34,8,7,34,7,31,7,3,28,18]
      Return the number of occurrences of the highest number and lowest number
      Highest is 34 -> 3 occurrences
      Lowest is 3 -> 2 occurrences
      Function should return 5
 */

fun main(){
val strin: String? = "askdjhaskdjha"
    strin?.replace(strin?.get(0), '4')

    val newStrin = strin ?: "newString"
}

fun Boolean.toBinary() = when {
    true -> 1
    else -> 0
}

fun Boolean.toBinary2() = if(this) 1 else 0

enum class DaysOfTheWeek {
    MON,
    TUES,
    WED
}

sealed class WeekDays
     data class MON(val firstDay: String): WeekDays()
     data class Tues(val bunber: Int): WeekDays()
     object WED: WeekDays()
