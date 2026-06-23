package com.example.lib.android_related

fun main() {
    val s = "IcecreAm"
    print(removeVowels(s))
}

fun removeVowels(t: String): String {
    val s = t.toCharArray()
    val vowels = "aeiouAEIOU"

    var l = 0
    var r = s.size - 1

    while (l < r) {
        if (!vowels.contains(s[l])) {
            l++
        }
        if (!vowels.contains(s[r])) {
            r--
        }

        if (vowels.contains(s[l]) && vowels.contains(s[r])) {
            val temp = s[l]
            s[l] = s[r]
            s[r] = temp
            l++
            r--
        }

    }
    return s.joinToString()
}
