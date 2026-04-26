package com.example.lib.simple_programe

fun main() {
    val n = 19
    println(isHappy(n))
}

fun isHappy(n: Int): Boolean {
    val seen = mutableSetOf<Int>()
    var num = n

    while (num != 1 && !seen.contains(num)) {
        seen.add(num)
        num = getNext(num)
    }

    return num == 1
}

fun getNext(n: Int): Int {
    var num = n
    var sum = 0

    while (num > 0) {
        val digit = num % 10
        sum += digit * digit
        num /= 10
    }

    return sum
}