package com.example.lib.simple_programe


fun main() {
    val list = mutableListOf(0, 1)
    var v1 = 0
    for (i in 0..10) {
        if (i <= list.size - 1) {
            v1 += list[i]
            list.add(v1)

        }
    }
    list.removeAt(0)
    list.removeAt(0)
    println(list)
}
