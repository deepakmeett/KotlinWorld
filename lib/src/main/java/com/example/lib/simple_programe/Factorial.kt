package com.example.lib.simple_programe



fun main() {
    val num = 5
    var v1 = 1
    for (i in 1..num) {
        v1 *= i
    }
    println(v1)

    var j: Int
    var m = 1
    for (i in 1..num) {
            j = m
            m = j * i
    }
    println(m)

}
