package com.example.lib.simple_programe

fun main() {

    val word = "deepak"
    print(isPalindrome(word))
}

fun isPalindrome(string: String): Boolean {
    var left = 0
    var right = string.length - 1
    while (left < right) {
        if (string[left] != string[right]) {
            return false
        }
        left++
        right--
    }
    return true
}
