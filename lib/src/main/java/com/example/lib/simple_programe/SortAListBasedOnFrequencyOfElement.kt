package com.example.lib.simple_programe

import java.util.Arrays



fun main() {
    println(sortByFrequency(listOf(1, 1, 2, 3, 3, 3, 4)))
// Output: [3, 3, 3, 1, 1, 2, 4]
}

fun sortByFrequency(list: List<Int>): List<Int> {
    val freqMap = list.groupingBy { it }.eachCount()

    return list.sortedWith(
        compareByDescending<Int> { freqMap[it] }
            .thenBy { it } // optional: sort by value if frequency is same
    )
}

//fun sortByFrequency(list: List<Int>): List<Int> {
//    val freqMap = list.groupBy { it }.mapValues { it.value.size }
//
//    return list.sortedWith(
//        compareByDescending<Int> { freqMap[it] }
//            .thenBy { it }
//    )
//}

//fun sortByFrequency(list: List<Int>): List<Int> {
//    val result = mutableListOf<Int>()
//    val temp = list.toMutableList()
//
//    while (temp.isNotEmpty()) {
//        val element = temp[0]
//        val count = temp.count { it == element }
//
//        repeat(count) {
//            result.add(element)
//        }
//
//        temp.removeAll { it == element }
//    }
//
//    return result
//}