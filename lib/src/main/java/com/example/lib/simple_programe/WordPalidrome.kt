package com.example.lib.simple_programe


fun main() {
    val name = "the cat and the dog"
    val mm = mutableMapOf<String, Int>()
    val ml = mutableListOf<String>()
    var word = ""
    for (i in name) {
        if (i.toString() != " ") {
            word += i
        } else {
            print(word)
            ml.add(word)
            word = ""
        }
    }
//
    ml.add(word)
    for (i in ml) {
        mm[i] = (mm[i] ?: 0) + 1
    }
    print(mm)
}