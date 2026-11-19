package com.example.lib.android_related.maths


fun main() {
    val n = 121
    println(palindromeNumber(n))
}

fun palindromeNumber(n: Int): Boolean {
    if (n < 0) return false

    var x = n
    var rev = 0
    while (x > 0) {
        val digit = x % 10
        rev = (rev * 10) + digit
        x /= 10
    }
    return n == rev
}
