package com.example.lib.android_related.sorting

fun main() {
    println(mergeSortedLists(listOf(1, 3, 5), listOf(2, 4, 6)))
}

fun mergeSortedLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return (list1 + list2).sorted()
}