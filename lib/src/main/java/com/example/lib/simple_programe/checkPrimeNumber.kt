package com.example.lib.simple_programe

fun main() {
    println(isPrime(11))
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false

    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}
