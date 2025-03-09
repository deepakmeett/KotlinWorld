package com.example.lib.simple_programe

fun main() {
    val number = 2
    val p = 3
    var result = 1
    for (i in 1..p) {
        result *= number
    }
    println(result)
}
