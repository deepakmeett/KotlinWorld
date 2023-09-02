package com.example.lib.simple_programe

fun main() {
    val numbers = arrayOf(1, 3, 2)

    var highestNumber = 0

    for (number in numbers) {
        if (highestNumber < number) {
            highestNumber = number
        }
    }

    if (highestNumber != 0) {
        println("The highest number is: $highestNumber")
    } else {
        println("The array is empty.")
    }
}
