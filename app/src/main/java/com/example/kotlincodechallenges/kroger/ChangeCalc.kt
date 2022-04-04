package com.example.kotlincodechallenges.kroger

fun main() {
//    println(calculateChange(29.99,40.00))
    println(calculateChange("10.99;15.00"))
}

fun calculateChange(input: String): String {

    val splitter = input.split(";")
    val price = splitter[0].toDouble()
    val cash = splitter[1].toDouble()
    val changeMap = mutableListOf<String>()
    changeMap[0]
    changeMap.get(0)

    if(cash == price) return "ZERO"
    if(cash < price) return "ERROR"

    //Declare constant values
    val hundredValue = 100.00
    val fiftyValue = 50.00
    val twentyValue = 20.00
    val tenValue = 10.00
    val fiveValue = 5.00
    val dollarValue = 1.00
    val halfDollarValue = .50
    val quarterValue = .25
    val dimeValue = .10
    val nickelValue = .5
    val convertCoins = 100 //converts coin values to int

    //Compute Change to be made
    var change = cash - price

    //Determine change to be made
    while (change >= dollarValue) {
        when {
            change >= hundredValue -> {
                change %= hundredValue
                changeMap.add("HUNDRED")
            }
            change >= fiftyValue -> {
                change %= fiftyValue
                changeMap.add("FIFTY")
            }
            change >= twentyValue -> {
                change %= twentyValue
                changeMap.add("TWENTY")
            }
            change >= tenValue -> {
                change %= tenValue
                changeMap.add("TEN")
            }
            change >= fiveValue -> {
                change %= fiveValue
                changeMap.add("FIVE")
            }
            else -> {
                change %= dollarValue
                changeMap.add("ONE")
            }
        }
    }

    /*At this point, total change is multiplied by a constant
**in order to deal with the coins as integers.*/
    while (change != 0.0) {
        when {
//            change < 1 -> {
//                change = (change.toFloat() * convertCoins).toDouble()
//            }
            change >= halfDollarValue -> {
                change %= halfDollarValue
                changeMap.add("HALF DOLLAR")
            }
            change >= quarterValue -> {
                change %= quarterValue
                changeMap.add("QUARTER")
            }
            change >= dimeValue -> {
                change %= dimeValue
                changeMap.add("DIME")
            }
            change >= nickelValue -> {
                change %= nickelValue
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