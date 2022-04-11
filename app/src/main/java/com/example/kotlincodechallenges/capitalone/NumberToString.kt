package com.example.kotlincodechallenges.capitalone

//Number To English

fun main() {
    println(transform(1234))
}

fun transform(number: Int): String{

    val digitNames = arrayOf(""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten",

        " eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen")

    val decimalNames = arrayOf(""," ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety")

    var soFar: String

    var numberToString = number

    if (numberToString % 100 < 20) {

        soFar = digitNames[numberToString % 100]

        numberToString /= 100

    } else {

        soFar = digitNames[numberToString % 10]

        numberToString /= 10

        soFar = decimalNames[numberToString % 10] + soFar

        numberToString /= 10

    }

    return if (numberToString == 0) soFar else digitNames[numberToString] + " hundred" + soFar

}