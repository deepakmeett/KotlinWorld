package com.example.lib.android_related.slidingWindow

//Input: s = "AABABBA", k = 1
//Output: 4
//Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//The substring "BBBB" has the longest repeating letters, which is 4.
//There may exists other ways to achieve this answer too.
fun main() {
    val s = "ABAB"
    val k = 0
    print(longestRepeatingCharacterReplacement(s, k))
}

fun longestRepeatingCharacterReplacement(s: String, k: Int): Int {
    var res = 0
    var count = 0
    var left = 0

    val freq = IntArray(26)

    val word = s.toCharArray()

    for (right in word.indices) {
        freq[word[right] - 'A']++
        count = maxOf(count, freq[word[right] - 'A'])


        while ((((right - left) + 1) - count) > k) {
            freq[word[left] - 'A']--
            left++
        }
        res = maxOf(res, right - left + 1)
    }
    return res
}
