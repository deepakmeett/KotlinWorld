package com.example.lib.android_related.arrays

fun main() {
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(3, 4, 5, 6)

    println(findCommon(list1, list2)) // [3, 4]
}

fun findCommon(list1: List<Int>, list2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    for (i in list1) {
        for (j in list2) {
            if (i == j) {
                result.add(i)
                break
            }
        }
    }
    return result
}
