package com.example.kotlincodechallenges.kroger

fun main() {
//    println(calculateChange(29.99,40.00))
    println(calculateChange("13.00;7.00"))

}

fun calculateChange(input: String): String {

    val splitter = input.split(";")
    val price = splitter[0].toDouble()
    val cash = splitter[1].toDouble()
    val changeMap = mutableListOf<String>()

    if(cash == price) return "ZERO"
    if(cash < price) return "ERROR"

    //Declare constant values
    val hundredValue = 100.00
    val fiftyValue = 50.00
    val twentyValue = 20.00
    val tenValue = 10.00
    val fiveValue = 5.00
    val twoValue = 2.00
    val dollarValue = 1.00
    val halfDollarValue = .50
    val quarterValue = .25
    val dimeValue = .10
    val nickelValue = .05
    val convertCoins = 100 //converts coin values to int

    //Compute Change to be made
    var change = cash - price // 2

    //Determine change to be made
    while (change >= 0.0) {
        when {
            change >= hundredValue -> {
                change -= hundredValue
                changeMap.add("HUNDRED")
            }
            change >= fiftyValue -> {
                change -= fiftyValue
                changeMap.add("FIFTY")
            }
            change >= twentyValue -> {
                change -= twentyValue
                changeMap.add("TWENTY")
            }
            change >= tenValue -> {
                change -= tenValue
                changeMap.add("TEN")
            }
            change >= fiveValue -> {
                change -= fiveValue
                changeMap.add("FIVE")
            }
            change >= twoValue -> {
                change -= twoValue
                changeMap.add("TWO")
            }
            change >= dollarValue -> {
                change -= dollarValue
                changeMap.add("ONE")
            }
            change >= halfDollarValue -> {
                change -= halfDollarValue
                changeMap.add("HALF DOLLAR")
            }
            change >= quarterValue -> {
                change -= quarterValue
                changeMap.add("QUARTER")
            }
            change >= dimeValue -> {
                change -= dimeValue
                changeMap.add("DIME")
            }
            change >= nickelValue -> {
                change -= nickelValue
                changeMap.add("NICKEL")
            }
            else -> {
                changeMap.add("PENNY")
                change = 0.0
            }
        }
    }

    /*At this point, total change is multiplied by a constant
**in order to deal with the coins as integers.*/
//    while (change != 0.0) {
//        when {
////            change < 1 -> {
////                change = (change.toFloat() * convertCoins).toDouble()
////            }
//
//        }
//    }

    return changeMap.joinToString(",")
}