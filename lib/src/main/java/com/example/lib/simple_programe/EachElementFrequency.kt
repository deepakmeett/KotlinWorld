package com.example.lib.simple_programe

fun main() {
    val list = listOf(7, 6, 7, 8, 4, 9, 4, 6)
    val freqMap = mutableMapOf<Int, Int>()

    for (num in list) {
        if (num in freqMap) {
            freqMap[num] = freqMap[num]?.plus(1) as Int
        } else {
            freqMap[num] = 1
        }
    }

    println("Frequencies: $freqMap")
}
