package com.example.lib

import java.lang.Integer.sum


fun main() {
    fun <T> List<T>.secondLast(): T {
        return this[size - 2]
    }

    val list = listOf(1, 2, 3, 4, 5)
    val secondLast = list.secondLast() // returns 4
//    android.util.Log.d(TAG, "main: $secondLast")
}


