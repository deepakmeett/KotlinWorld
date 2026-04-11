package com.example.lib.simple_programe

fun main() {
    println(findMax(10, 20, 30))
}


    fun findMax(a: Int, b: Int, c: Int): Int {
        var max = a

        if (b > max) {
            max = b
        }
        if (c > max) {
            max = c
        }

        return max
    }

//    fun findMax(a: Int, b: Int, c: Int): Int {
//        return listOf(a, b, c).maxOrNull()!!
//    }
