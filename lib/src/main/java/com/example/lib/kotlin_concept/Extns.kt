package com.example.lib.kotlin_concept

import java.util.Locale


fun main() {
    fun <T> List<T>.secondLast(): T {
        return this[size - 2]
    }
    val list = listOf(1, 2, 3, 4, 5)
    val secondLast = list.secondLast() // returns 4
    println(secondLast)

    println("#############################################################")

    val num = 5
    fun Int.square(): Int {
        return this * this
    }
    val sqaureValue = num.square()
    println(sqaureValue)

    println("#############################################################")

    val text = "Hello, World"
    fun String.containsIgnore(value: String): Boolean {
        return this.lowercase(Locale.getDefault()).contains(value.lowercase(Locale.getDefault()))
    }
    val containSubstring = text.containsIgnore("Baby")
    println(containSubstring)
}

