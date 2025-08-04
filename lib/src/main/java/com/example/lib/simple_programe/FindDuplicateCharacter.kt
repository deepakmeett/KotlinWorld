package com.example.lib.simple_programe

fun main() {

    val word = "Deepak"
    val charArray = word.lowercase().toCharArray()
    val duplicates = mutableSetOf<Char>()
    val seen = mutableSetOf<Char>()

    for (i in charArray.indices) {
        if (charArray[i] in seen) {
            duplicates.add(charArray[i])
        } else {
            seen.add(charArray[i])
        }
    }

    println("Duplicate characters: ${duplicates.joinToString()}")
}