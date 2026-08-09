package com.example.lib.android_related.arrays

fun main() {
    val list = listOf(listOf(1, 2), listOf(3, 4), listOf(5))
    println(flattenList(list)) // [1, 2, 3, 4, 5]
}

fun flattenList(list: List<List<Int>>): List<Int> {
    val result = mutableListOf<Int>()

    for (subList in list) {
        for (item in subList) {
            result.add(item)
        }
    }

    return result
}
