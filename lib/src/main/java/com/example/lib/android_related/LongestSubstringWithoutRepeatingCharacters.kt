package com.example.lib.android_related

//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

fun main() {
    val input = "abcabcbb"
    print(longestSubstringWithoutRepeatingCharacters(input))
}

fun longestSubstringWithoutRepeatingCharacters(input: String): Int {
    var maxLength = 0
    var left = 0
    val uniqueChars = mutableSetOf<Char>()
    for (right in input.indices) {
        while (uniqueChars.contains(input[right])) {
            uniqueChars.remove(input[left])
            left++
        }
        uniqueChars.add(input[right])
        maxLength = maxOf(maxLength, right - left + 1)
    }

    return maxLength
}
