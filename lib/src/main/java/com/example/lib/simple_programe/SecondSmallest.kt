package com.example.lib.simple_programe

fun main() {
    val list = listOf(7, 6, 7, 8, 4, 9)

    var min = Int.MAX_VALUE
    var secondMin = Int.MAX_VALUE

    for (i in list) {
        if (i < min) {
            secondMin = min
            min = i
        } else if (i != min && i < secondMin) {
            secondMin = i
        }
    }

    println("Second smallest: $secondMin")
}
