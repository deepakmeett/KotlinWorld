package com.example.lib.android_related.twoPointers

//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'.

fun main() {
    val s = "abca"
    println(validPalindrome2(s))
}

fun validPalindrome2(s: String): Boolean {
    var l = 0
    var r = s.length - 1
    while (l < r) {
        if (s[l] != s[r]) {
            return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1)
        }
        l++
        r--
    }
    return true
}

fun isPalindrome(s: String, l: Int, r: Int): Boolean {
    var left = l
    var right = r
    while (left < right) {
        if (s[left] != s[right]) {
            return false
        }
        left++
        right--
    }
    return true
}
