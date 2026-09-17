package com.example.lib.android_related.twoPointers


fun main() {
    val s = charArrayOf('h', 'e', 'l', 'l', 'o')

    var left = 0
    var right = s.size - 1

    while (left < right) {
        val temp = s[left]
        s[left] = s[right]
        s[right] = temp
        left++
        right--
    }

    print(s.joinToString())

}
