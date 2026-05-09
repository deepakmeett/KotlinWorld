package com.example.lib.android_related

fun main() {
    println(longestPalindrome("babad")) // "bab" or "aba"
    println(longestPalindrome("cbbd"))  // "bb"
}

fun longestPalindrome(s: String): String {
    var longest = ""

    for (i in s.indices) {
        for (j in i until s.length) {
            val sub = s.substring(i, j + 1)
            if (sub == sub.reversed() && sub.length > longest.length) {
                longest = sub
            }
        }
    }

    return longest
}