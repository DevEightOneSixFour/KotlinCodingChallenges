package com.example.kotlincodechallenges.kroger

fun calculateChange(amt: Double, bill: Double): String {
    if (bill == amt) return "ZERO"
    if (amt > bill) return "ERROR"
    var diff = bill - amt
    val map: MutableMap<Double, String> = mutableMapOf(
        12.00 to "String"

    )
    map[100.0] = "HUNDRED DOLLAR"
    map[50.0] = "FIFTY DOLLAR"
    map[20.0] = "TWENTY DOLLAR"
    map[10.0] = "TEN DOLLAR"
    map[5.0] = "FIVE DOLLAR"
    map[2.0] = "TWO DOLLAR"
    map[1.0] = "DOLLAR"
    map[0.5] = "HALF DOLLAR"
    map[0.25] = "QUARTER"
    map[0.1] = "DIME"
    map[0.05] = "FIVE CENT"
    map[0.02] = "TWO CENT"
    map[0.01] = "CENT"
    val sb = StringBuffer()
    for (curr in map.keys) {

            while (curr <= diff) {
                if (sb.length > 1) sb.append(",")
                sb.append(map[curr])
                diff -= curr
            }

    }
    return sb.toString()
}

fun main() {
   println(calculateChange(15.94, 16.00))
}