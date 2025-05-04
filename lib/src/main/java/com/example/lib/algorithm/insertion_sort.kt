package com.example.lib.algorithm

fun insertionSort(arr: IntArray) {
    for (i in 1 until arr.size) {
        val key = arr[i]
        var j = i - 1

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = key
    }
}

fun main() {
    val numbers = intArrayOf(9, 5, 1, 4, 3)
    println("Before sorting: ${numbers.joinToString()}")
    insertionSort(numbers)
    println("After sorting: ${numbers.joinToString()}") }
