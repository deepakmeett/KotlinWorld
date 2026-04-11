package com.example.lib.simple_programe

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
//fun findCommon(list1: List<Int>, list2: List<Int>): Set<Int> {
//    return list1.intersect(list2.toSet())
//}
//fun findCommon(list1: List<Int>, list2: List<Int>): List<Int> {
//    return list1.filter { it in list2 }
//}