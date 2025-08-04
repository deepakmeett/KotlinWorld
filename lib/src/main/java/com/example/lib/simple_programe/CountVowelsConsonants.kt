package com.example.lib.simple_programe

fun main() {
    val text = "Hello World"
    countVowelsAndConsonants(text)
}

fun countVowelsAndConsonants(input: String) {
    val vowels = "aeiouAEIOU"
    var vowelCount = 0
    var consonantCount = 0

    for (char in input) {
        if (char.isLetter()) {
            if (char in vowels) {
                vowelCount++
            } else {
                consonantCount++
            }
        }
    }

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
}
