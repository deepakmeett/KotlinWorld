package com.example.lib.simple_programe

fun main() {
    val list = listOf(7, 6, 7, 8, 4, 9, 4, 6)
    val duplicates = findDuplicates(list)
    println("Duplicate elements: $duplicates")
}

fun findDuplicates(arr: List<Int>): Set<Int> {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()

    for (num in arr) {
        if (!seen.add(num)) {
            duplicates.add(num)
        }
    }

    return duplicates
}
