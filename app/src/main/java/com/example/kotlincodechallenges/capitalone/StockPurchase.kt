package com.example.kotlincodechallenges.capitalone
// AKA MaximumDifference
fun main() {
    val prices = arrayOf(110, 102, 97, 103, 106)

    var bestSell = prices[1] - prices[0]
    var buyIndex = 0
    var sellIndex = 0

    // Time Complexity: O(n)
    var trackStock = prices[0]
    for (i in prices.indices) {
        if (prices[i] - trackStock > bestSell) {
            bestSell = trackStock - prices[i]
            buyIndex = prices.indexOf(trackStock)
            sellIndex = i
        }
        if (trackStock > prices[i]){
            trackStock = prices[i]
        }
    }

    // Time Complexity: O(n^2)
    for (i in prices.indices) {
        for (j in i until prices.size) {
            if (prices[j] - prices[i] > bestSell) {
                bestSell = prices[j] - prices[i]
                buyIndex = i
                sellIndex = j
            }
        }
    }

    testStockPurchase(buyIndex, sellIndex, prices)
}

fun testStockPurchase(buyIndex: Int, sellIndex: Int, prices: Array<Int>) {
    if (buyIndex != -1 && sellIndex != -1) {
        println("\tBuy on day: $buyIndex with a value of ${prices[buyIndex]}")
        println("\tSell on day: $sellIndex with a value of ${prices[sellIndex]}")
    }
}

fun maxDiff(arr: IntArray, arr_size: Int): Int {
    var max_diff = arr[1] - arr[0]
    var j: Int
    var i: Int = 0
    while (i < arr_size) {
        j = i + 1
        while (j < arr_size) {
            if (arr[j] - arr[i] > max_diff) max_diff = arr[j] - arr[i]
            j++
        }
        i++
    }
    return max_diff
}