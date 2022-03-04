package com.example.kotlincodechallenges

import java.time.LocalDate
import java.time.Period

// calculates time differences
fun main(){
    val month  = Month()
    month.monthCalculate()
}
class Month {
    fun monthCalculate(){
        val start : LocalDate = LocalDate.parse("2017-06-01")
        val end : LocalDate = LocalDate.parse("2019-02-01")
        val diff: Period? = Period.between(start,end)
        println(diff)
    }
}