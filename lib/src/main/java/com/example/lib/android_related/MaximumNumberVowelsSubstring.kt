package com.example.lib.android_related

//Input: s = "abciiidef", k = 3
//Output: 3
//Explanation: The substring "iii" contains 3 vowel letters.

fun main() {
//    val s = "abciiidef"
//    val k = 3

//    val s = "aeiou"
//    val k = 2

    val s = "leetcode"
    val k = 3

    print(maxVowels(s, k))
}

fun maxVowels(s: String, k: Int): Int {
    var l = 0
    var r = 0
    var res = 0
    var window = 0

    while (r < k) {
        window += isVowel(s[r])
        r++
    }

    res = window

    while (r < s.length) {
        window -= isVowel(s[l++])
        window += isVowel(s[r++])
        res = maxOf(res, window)
    }

    return res
}

fun isVowel(c: Char): Int {
    return when (c) {
        'a', 'e', 'i', 'o', 'u' -> 1
        else -> 0
    }
}
