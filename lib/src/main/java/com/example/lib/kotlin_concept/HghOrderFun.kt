package com.example.lib.kotlin_concept

fun main() {
    val result1 = orderHighFun(2, 3, ::sum)
    println("Result of sum: $result1") // Output: Result of sum: 5

    val result2 = orderHighFun(3, 4, ::multiply)
    println("Result of multiply: $result2") // Output: Result of multiple: 12
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun orderHighFun(a: Int, b: Int, anyFun: (Int, Int) -> Int): Int {
    return anyFun(a, b)
}

