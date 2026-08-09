package com.example.lib.android_related.hashMapHashSet


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
