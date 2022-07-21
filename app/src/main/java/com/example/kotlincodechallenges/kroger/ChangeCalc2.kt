package com.example.kotlincodechallenges.kroger

import java.math.RoundingMode

fun Double.roundThis(): Double {
    return this.toBigDecimal().setScale(2, RoundingMode.HALF_DOWN).toDouble()
}

class CashRegister {
    fun calculateChange(price: Double, cash: Double): String {

        if (price > cash) return "ERROR"
        if (price == cash) return "ZERO"

        var change = (cash - price).roundThis()
        println("Change: $change")
        val changeString = StringBuilder()

        while (change > 0.00) {

            change -= when {
                change >= 100.0 -> {
                    changeString.append("ONE HUNDRED")
                    100.0
                }

                change >= 50.0 -> {
                    changeString.append("FIFTY")
                    50.0
                }

                change >= 20.0 -> {
                    changeString.append("TWENTY")
                    20.0
                }

                change >= 10.0 -> {
                    changeString.append("TEN")
                    10.0
                }

                change >= 5.0 -> {
                    changeString.append("FIVE")
                    5.0
                }

                change >= 1.0 -> {
                    changeString.append("ONE")
                    1.0
                }

                change >= 0.5 -> {
                    changeString.append("HALF DOLLAR")
                    0.5
                }

                change >= 0.25 -> {
                    changeString.append("QUARTER")
                    0.25
                }

                change >= 0.1 -> {
                    changeString.append("DIME")
                    0.1
                }

                change >= 0.05 -> {
                    changeString.append("NICKEL")
                    0.05
                }

                else -> {
                    changeString.append("PENNY")
                    0.1
                }
            }

            changeString.append(",")
        }

        changeString.setLength(changeString.length - 1)
        return changeString.toString()
    }
}


fun main() {

    /*
    100 = "ONE HUNDRED"
    50 = "FIFTY"
    20 = "TWENTY"
    10
    5
    2
    1
    .50
    .25
    .10 = "DIME"
    .05 = "NICKEL"
    .01 = "PENNY"
     */


    val input = "10.99;200.50"
    val fromTest = "15.94;16.00"

    val arr = fromTest.split(";")
    val price = arr[0].toDouble()
    val cash = arr[1].toDouble()

    val cashRegister = CashRegister()
    println(cashRegister.calculateChange(price, cash))
}