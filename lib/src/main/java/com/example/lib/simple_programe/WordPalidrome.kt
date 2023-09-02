package com.example.lib.simple_programe


fun main() {
    val v1 = "Deepak"
    var v2 = ""
    for (i in v1.length - 1 downTo 0) {
        v2 += v1[i].toString()
    }

    println(v1)
    println(v2)

    if (v1 == v2) {
        println("This word is a palindrome")
    } else {
        println("This word is not a palindrome")
    }
}
