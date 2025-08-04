package com.example.lib.simple_programe

fun main() {
    val list = listOf(7, 6, 7, 8, 4, 9)

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (i in list) {
        if (i > max) {
            secondMax = max
            max = i
        } else if (i != max && i > secondMax) {
            secondMax = i
        }
    }

    println("Second largest: $secondMax")
}
