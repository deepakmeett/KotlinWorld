package com.example.lib.android_related.twoPointers

//Input: s = "abc", t = "ahbgdc"
//Output: true

fun main() {
    val s = "axc"
    val t = "ahbgdc"

    println(isSubsequence(s, t))
}

fun isSubsequence(s: String, t: String): Boolean {
    if (s.isEmpty()) return true
    val n1 = s.length - 1
    val n2 = t.length - 1

    var i = 0
    var j = 0

    while (i <= n1 && j <= n2) {
        if (s[i] == t[j]) {
            i++
        }
        j++
    }

    return i == n1 + 1
}