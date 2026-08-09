package com.example.lib.android_related.slidingWindow

//Input: s1 = "ab", s2 = "eidbaooo"
//Output: true
//Explanation: s2 contains one permutation of s1 ("ba").

fun main() {
    val s1 = "ab"
    val s2 = "eidbaooo"
    print(permutationInString(s1, s2))
}

fun permutationInString(s1: String, s2: String): Boolean {
    var res = false
    val k = s1.length
    var l = 0
    var word = ""
    if (s1.length < s2.length) return res

    val sArr1 = IntArray(26)
    val sArr2 = IntArray(26)

    for (i in s1.indices) {
        sArr1[s1[i] - 'a']++
    }

    for (j in s2.indices) {
        word += s2[j]
        sArr2[s1[j] - 'a']++

        if (j - l + 1 > k) {
            sArr2[s1[j] - 'a']--
            l++
        }

        if (word.length == k) {
            if (sArr1.contentEquals(sArr2)) {
                res = true
                break
            }
        }
    }

    return res
}
