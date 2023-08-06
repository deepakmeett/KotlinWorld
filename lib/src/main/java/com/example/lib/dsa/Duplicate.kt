package com.example.lib.dsa

fun main() {
    val list = listOf("orange", "apple", "apple", "banana", "water", "bread",
                      "banana", "apple", "apple", "banana", "water", "bread", "banana")

    val elementCounts = mutableMapOf<String, Int>()

    // Count occurrences of each element in the list
    for (element in list) {
        val count = elementCounts[element] ?: 0
        elementCounts[element] = count + 1
    }

    // Print duplicate elements and their counts
    for ((element, count) in elementCounts) {
        if (count > 1) {
            println("$element = $count")
        }
    }
}
