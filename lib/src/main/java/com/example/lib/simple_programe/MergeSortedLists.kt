package com.example.lib.simple_programe

fun main() {
    println(mergeSortedLists(listOf(1, 3, 5), listOf(2, 4, 6)))
}

//fun mergeSortedLists(list1: List<Int>, list2: List<Int>): List<Int> {
//    val result = mutableListOf<Int>()
//    var i = 0
//    var j = 0
//
//    while (i < list1.size && j < list2.size) {
//        if (list1[i] <= list2[j]) {
//            result.add(list1[i])
//            i++
//        } else {
//            result.add(list2[j])
//            j++
//        }
//    }
//
//    // Add remaining elements
//    while (i < list1.size) {
//        result.add(list1[i])
//        i++
//    }
//
//    while (j < list2.size) {
//        result.add(list2[j])
//        j++
//    }
//
//    return result
//}

fun mergeSortedLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return (list1 + list2).sorted()
}