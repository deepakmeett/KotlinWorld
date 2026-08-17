package com.example.lib.android_related.twoPointers

//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.

fun main() {
    val name = "A man, a plan, a canal: Panama"
    println(validPalindrome(name))
}

fun validPalindrome(name: String): Boolean {
    var left = 0
    var right = name.length - 1
    while (left < right) {
        if (!name[left].isLetterOrDigit()) {
            left++
            continue
        }
        if (!name[right].isLetterOrDigit()) {
            right--
            continue
        }

        if (name[left].lowercaseChar() != name[right].lowercaseChar()) {
            return false
        }
        left++
        right--
    }
    return true
}