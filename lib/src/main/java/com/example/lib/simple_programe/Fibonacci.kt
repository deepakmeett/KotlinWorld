package com.example.lib.simple_programe

fun main() {
    var a = 0
    var b = 1
    var result = 0
    println(a)
    println(b)
    for (i in 0..6) {
        result = a + b
        a = b
        b = result
        println(result)
    }
}
