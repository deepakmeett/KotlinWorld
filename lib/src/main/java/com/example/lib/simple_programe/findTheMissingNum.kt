package com.example.lib.simple_programe

fun main() {
    var firstElement = 0
    var secondElement = 0
    val list = listOf(1, 7, 9, 10)

    for (i in list.indices) {
        if (i < list.size - 1) {
            firstElement = list[i]
        }
        if (i + 1 < list.size) {
            secondElement = list[i + 1]
        }
        for (j in firstElement..secondElement) {
            if (j > firstElement && j < secondElement) {
                println("Missing number is -> $j")
            }
        }
    }
}
