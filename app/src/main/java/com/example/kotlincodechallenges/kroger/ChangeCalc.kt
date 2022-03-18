package com.example.kotlincodechallenges

fun main() {
    println(calculateChange(29.99,40.00))
}
fun calculateChange(price: Double, cash: Double): String {
    val changeMap = mutableListOf<String>()

    if(cash == price) return "ZERO"
    if(cash < price) return "ERROR"

    val numberArray = arrayOf("ONE", "TWO", "THREE")
    var hundredCount = 0

    //Declare constant values
    val hundredValue = 100
    val fiftyValue = 50
    val twentyValue = 20
    val tenValue = 10
    val fiveValue = 5
    val dollarValue = 1
    val halfDollarValue = 50
    val quarterValue = 25
    val dimeValue = 10
    val nickelValue = 5
    val convertCoins = 100 //converts coin values to int

    var change = 0.0 // change to be made

    //Compute Change to be made
    change = cash - price

    //Determine change to be made
    while (change >= dollarValue) {
        when {
            change >= hundredValue -> {
                change %= hundredValue.toDouble()
                changeMap.add("HUNDRED")
                hundredCount++
            }
            change >= fiftyValue -> {
                change %= fiftyValue.toDouble()
                changeMap.add("FIFTY")
            }
            change >= twentyValue -> {
                change %= twentyValue.toDouble()
                changeMap.add("TWENTY")
            }
            change >= tenValue -> {
                change %= tenValue.toDouble()
                changeMap.add("TEN")
            }
            change >= fiveValue -> {
                change %= fiveValue.toDouble()
                changeMap.add("FIVE")
            }
            else -> {
                change %= dollarValue.toDouble()
                changeMap.add("ONE")
            }
        }
    }

    /*At this point, total change is multiplied by a constant
**in order to deal with the coins as integers.*/
    while (change != 0.0) {
        when {
            change < 1 -> {
                change = (change.toFloat() * convertCoins).toDouble()
            }
            change >= halfDollarValue -> {
                change %= halfDollarValue.toDouble()
                changeMap.add("HALF DOLLAR")
            }
            change >= quarterValue -> {
                change %= quarterValue.toDouble()
                changeMap.add("QUARTER")
            }
            change >= dimeValue -> {
                change %= dimeValue.toDouble()
                changeMap.add("DIME")
            }
            change >= nickelValue -> {
                change %= nickelValue.toDouble()
                changeMap.add("NICKEL")
            }
            else -> {
                changeMap.add("PENNY")
                change = 0.0
            }
        }
    }

    return changeMap.joinToString(",")
}