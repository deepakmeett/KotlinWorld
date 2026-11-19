package com.example.lib.android_related.maths


fun main() {
//    val digits = intArrayOf(1, 2, 3)
    val digits = intArrayOf(9)
    println(plusOne(digits).contentToString())
}

fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }

    val result = IntArray(digits.size + 1)
    result[0] = 1
    return result
}
