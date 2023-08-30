package com.example.lib.dsa


fun main() {
    val v1 = "this is a ball"
    var v2 = ""

    for (i in v1.length downTo 0) {
        if (v1.length > i) {
            v2 += v1[i]
        }
    }

    println(v1.replace(" ", ""))
    println(v2.replace(" ", ""))

    if (v1.trim() == v2.trim()) {
        println("This word is a palindrome")
    } else {
        println("This word is not a palindrome")
    }

}
