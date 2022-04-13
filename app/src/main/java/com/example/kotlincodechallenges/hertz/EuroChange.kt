package com.example.kotlincodechallenges.hertz

import java.math.RoundingMode

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 *
 *
Write a method that returns an object containing
(number of euro, 50 cent, 20 cent, 10 cent, 5 cent, 2 cent and 1 cent coins)

The input parameters are shopping_total and amount_tendered.

Basically think of a self service shopping machine in Tesco,
how it calculates the least number of coins to return after somebody puts money into
the machine for their shopping.

fun getLeastNumberOfCoins(shoppingTotal: float, amountTendered: float) : CoinBreakDown
20 10 5
20 euro note,
10 euro note,
5 euro note,
50 cent coin,
20 cent coin,
10 cent coin,
5 cent coin,
1 euro coin,
 */

// They only asked up to the 20 euro note
const val EURO_500 = "500€"
const val EURO_200 = "200€"
const val EURO_100 = "100€"
const val EURO_50 = "50€"
const val EURO_20 = "20€"
const val EURO_10 = "10€"
const val EURO_5 = "5€"
const val EURO_2 = "2€"
const val EURO_1 = "1€"
const val CENT_50 = ".50€"
const val CENT_20 = ".20€"
const val CENT_10 = ".10€"
const val CENT_5 = ".05€"
const val CENT_1 = ".01€"

fun main() {
    println(getLeastNumberOfCoins(70.54f,100.00f ))
}

fun getLeastNumberOfCoins(shoppingTotal: Float, amountTendered: Float) : MutableMap<String,Int> {

    val changeMap = mutableMapOf(
        EURO_500 to 0,
        EURO_200 to 0,
        EURO_100 to 0,
        EURO_50 to 0,
        EURO_20 to 0,
        EURO_10 to 0,
        EURO_5 to 0,
        EURO_2 to 0,
        EURO_1 to 0,
        CENT_50 to 0,
        CENT_20 to 0,
        CENT_10 to 0,
        CENT_5 to 0,
        CENT_1 to 0
    )

    var change = (amountTendered - shoppingTotal).roundTwoDecimals()
    println("Change: $change")
    // 29.46

    while (change >= 1) {
        when {
            change >= 500 -> {
                change = (change - 500f).roundTwoDecimals()
                changeMap[EURO_500] = changeMap.getValue(EURO_500) + 1
            }
            change >= 200 -> {
                change = (change - 200f).roundTwoDecimals()
                changeMap[EURO_200] = changeMap.getValue(EURO_200) + 1
            }
            change >= 100 -> {
                change = (change - 100f).roundTwoDecimals()
                changeMap[EURO_100] = changeMap.getValue(EURO_100) + 1
            }
            change >= 50 -> {
                change = (change - 50f).roundTwoDecimals()
                changeMap[EURO_50] = changeMap.getValue(EURO_50) + 1
            }
            change >= 20 -> {
                change = (change - 20f).roundTwoDecimals()
                changeMap[EURO_20] = changeMap.getValue(EURO_20) + 1 // 0 -> 1, change 9.46
            }
            change >= 10 -> {
                change = (change - 10f).roundTwoDecimals()
                changeMap[EURO_10] = changeMap.getValue(EURO_10) + 1
            }
            change >= 5f  -> {
                change = (change - 5f).roundTwoDecimals()
                changeMap[EURO_5] = changeMap.getValue(EURO_5) + 1 // 0 -> 1, change 4.46
            }
            change >= 2f  -> {
                change = (change - 2f).roundTwoDecimals()
                changeMap[EURO_2] = changeMap.getValue(EURO_2) + 1
            }
            else -> {
                change = (change - 1f).roundTwoDecimals()
                changeMap[EURO_1] = changeMap.getValue(EURO_1) + 1
            }
        }
        println("Current Dollar Change: $change")
    }

    while(change > 0.0) {
        when {
            change >= .50 -> {
                change = (change - .50f).roundTwoDecimals()
                changeMap[CENT_50] = changeMap.getValue(CENT_50) + 1
            }
            change >= .20 -> {
                change = (change - .20f).roundTwoDecimals()
                changeMap[CENT_20] = changeMap.getValue(CENT_20) + 1
            }
            change >= .10 -> {
                change = (change - .10f).roundTwoDecimals()
                changeMap[CENT_10] = changeMap.getValue(CENT_10) + 1
            }
            change >= .05 -> {
                change = (change - .05f).roundTwoDecimals()
                changeMap[CENT_5] = changeMap.getValue(CENT_5) + 1
            }
            else -> {
                change = (change - .01f).roundTwoDecimals()
                changeMap[CENT_1] = changeMap.getValue(CENT_1) + 1
            }
        }
        println("Current Coin Change: $change")
    }
    return changeMap
}

fun Float.roundTwoDecimals(): Float{
    return this.toDouble().toBigDecimal().setScale(2, RoundingMode.HALF_DOWN).toFloat()
}