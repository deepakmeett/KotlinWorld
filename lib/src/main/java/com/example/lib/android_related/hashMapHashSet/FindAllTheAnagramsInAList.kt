package com.example.lib.android_related.hashMapHashSet

fun main() {
    val words = listOf("eat", "tea", "tan", "ate", "nat", "bat")

    println(findAnagrams(words))
}

fun findAnagrams(words: List<String>): List<List<String>> {
    return words.groupBy { word ->
        word.toCharArray().sorted().joinToString("")
    }.values.toList()
}