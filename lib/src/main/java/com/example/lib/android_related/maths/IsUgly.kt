package com.example.lib.android_related.maths


fun main() {
    val c = 6
    println(isUgly(c))
}

fun isUgly(c: Int): Boolean {
    var n = c
    while (n > 1) {
        n /= if (n % 2 == 0) {
            2
        } else if (n % 3 == 0) {
            3
        } else if (n % 5 == 0) {
            5
        } else {
            return false
        }
    }
    return n == 1
}
