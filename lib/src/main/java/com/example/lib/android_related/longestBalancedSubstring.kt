package com.example.lib.android_related

fun main() {
    val s = "abbac"
//    val s = "zzabccy"
//    val s = "aba"
    println(longestBalancedSubstring(s))
}

fun longestBalancedSubstring(s: String): Int {
    var ans = 0

    for (i in s.indices) {
        val freq = mutableMapOf<Char, Int>()

        for (j in i until s.length) {
            // Add current character
            freq[s[j]] = freq.getOrDefault(s[j], 0) + 1

            // Check if balanced
            if (isBalanced(freq)) {
                ans = maxOf(ans, j - i + 1)
            }
        }
    }

    return ans
}

fun isBalanced(freq: Map<Char, Int>): Boolean {
    val first = freq.values.first()

    for (count in freq.values) {
        if (count != first) {
            return false
        }
    }

    return true
}