package com.example.lib.android_related.maths


fun main() {
    val x = 4
    println("mySqrt(4) = ${mySqrt(x)}")
    println("mySqrt(8) = ${mySqrt(8)}")
}

/**
 * LeetCode 69: Sqrt(x)
 * Computes the integer square root of x using Newton's Method (Newton-Raphson).
 * Formula: r = (r + x / r) / 2
 */
fun mySqrt(x: Int): Int {
    if (x == 0) return 0

    var r = x.toLong()
    while (r * r > x) {
        r = (r + x / r) / 2
    }

    return r.toInt()
}
