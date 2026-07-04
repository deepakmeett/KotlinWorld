package com.example.lib.android_related

// Input: s = "ca"
// Output: 2

fun main() {
//    val s = "ca"
//    val s = "cabaabac"
//    val s = "aabccabba"
    val s = "aabaaa"
    println(minimumLength(s))
}

fun minimumLength(s: String): Int {
    val n = s.length
    var l = 0
    var r = n - 1

    while (l < r && s[l] == s[r]) {
        val ch = s[l]
        while (l < r && s[l] == ch) l++
        while (l <= r && s[r] == ch) r--
    }

    return r - l + 1
}