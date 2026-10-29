package com.example.lib.android_related.stack

//The span of the stock's price in one day is the maximum number of
// consecutive days (starting from that day and going backward) for which the stock price was less than or equal to the price of that day.

fun main() {
    val input = intArrayOf(100, 80, 60, 70, 60, 75, 85)
    println(stockSpanner(input))
}

class StockSpanner {
    private val stack = ArrayDeque<Pair<Int, Int>>() // Stores Pair(price, span)

    fun next(price: Int): Int {
        var span = 1
        while (stack.isNotEmpty() && stack.last().first <= price) {
            span += stack.removeLast().second
        }
        stack.addLast(price to span)
        return span
    }
}

fun stockSpanner(input: IntArray): List<Int> {
    val spanner = StockSpanner()
    return input.map { spanner.next(it) }
}
