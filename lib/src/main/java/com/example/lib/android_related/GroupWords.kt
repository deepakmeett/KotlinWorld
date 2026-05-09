package com.example.lib.android_related

import kotlin.collections.iterator

fun main() {
    val words = arrayOf("apple", "ant", "bat", "ball")
    val ml = mutableMapOf<Char, MutableList<String>>()

    for (word in words) {
        val firstChar = word[0]

        // If key not present, create a new list
        if (!ml.containsKey(firstChar)) {
            ml[firstChar] = mutableListOf()
        }

        // Add the word to the correct list
        ml[firstChar]!!.add(word)
    }

    // Print map
    for ((key, value) in ml) {
        println("$key -> $value")
    }
}
