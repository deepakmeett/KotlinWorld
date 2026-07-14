package com.example.lib.android_related

//Input: s = "cbaebabacd", p = "abc"
//Output: [0,6]
//Explanation:
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".

fun main() {
    val s = "abab"
    val p = "ab"
    print(findAllAnagram(s, p))
}

fun findAllAnagram(s: String, p: String): List<Int> {
    if (s.length < p.length) return emptyList()

    val pCount = IntArray(26)
    val sCount = IntArray(26)

    for (i in p.indices) {
        pCount[p[i] - 'a']++
        sCount[s[i] - 'a']++
    }

    val result = mutableListOf<Int>()

    if (pCount.contentEquals(sCount)) {
        result.add(0)
    }

    for (i in 1..s.length - p.length) {
        sCount[s[i - 1] - 'a']--
        sCount[s[i + p.length - 1] - 'a']++

        if (pCount.contentEquals(sCount)) {
            result.add(i)
        }
    }

    return result
}
