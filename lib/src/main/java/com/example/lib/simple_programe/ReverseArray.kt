package com.example.lib.simple_programe


fun main() {
    val array = arrayOf(7, 6, 7, 8, 9, 4)

    var left = 0
    var right = array.size - 1

    while (left < right) {
        val temp = array[left]
        array[left] = array[right]
        array[right] = temp
        left++
        right--
    }

    print(array.joinToString())

}
