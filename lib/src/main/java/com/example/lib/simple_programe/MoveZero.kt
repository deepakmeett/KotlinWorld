package com.example.lib.simple_programe

fun main() {
    val num = intArrayOf(0, 1, 0, 3, 12)
    var left = 0
    for (right in num.indices) {
        if (num[right] != 0) {
            val temp = num[left]
            num[left] = num[right]
            num[right] = temp
            left++
        }
    }

    print(num.joinToString())
}