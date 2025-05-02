package com.example.lib.algorithm


fun main() {
    val array = arrayOf(5, 4, 3, 2, 1)

    for (i in 0 until array.size) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    println(array.joinToString("")) // Correct Output: 12345
}
