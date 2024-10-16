package com.example.lib.simple_programe



fun main() {
    var v1 = 1
    for (i in 1..5) {
        v1 *= i
    }
    println(v1)

    val list = listOf(1, 2, 3, 4, 5, 6)
    var j: Int
    var l = 1
    for (i in list.indices) {
        if (list.size > i + 1) {
            j = l
            l = j * list[i + 1]
        }
    }
    println(l)

}
