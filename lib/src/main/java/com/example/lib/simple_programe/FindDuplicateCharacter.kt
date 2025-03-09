package com.example.lib.simple_programe

fun main() {

    val word = "Deepak"

    var gotChar = ""

    val char = word.toCharArray()

    for (i in 0..char.size) {
        for (j in (i + 1) until char.size) {
            if (char[i] == char[j]) {
                gotChar = char[j].toString()
                print(gotChar)
            }
        }
    }
}