package com.example.lib.android_related

fun main() {
//    Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    val nums = intArrayOf(7, 1, 5, 3, 6, 4)
//    val nums = intArrayOf(7, 6, 4, 3, 1)
    val nums = intArrayOf(1, 2)
    print(timeToSellStocks(nums))
}

fun timeToSellStocks(prices: IntArray): Int {
    var result = 0
    var minPrice = prices[0]

    for (i in 1 until prices.size) {
        if (minPrice < prices[i]) {
            val profit = prices[i] - minPrice
            if (profit > result) {
                result = profit
            }
        } else {
            minPrice = prices[i]
        }
    }
    return result
}
