package com.example.lib.dsa

fun main() {
    var evenSum = 0
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in list) {
        if (list[i - 1] % 2 == 0) {
            evenSum += list[i - 1]
        }
    }
    println(evenSum)
}
