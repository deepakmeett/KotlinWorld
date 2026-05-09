package com.example.lib.android_related

fun main() {
    val s = "anagram"
    val t = "nagaram"
    println(isAnagram(s, t))
}
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val freq = IntArray(26)

    for (i in s.indices){
        freq[s[i] - 'a']++
        freq[t[i] - 'a']--
    }

    for(i in freq){
        if(i != 0){
            return false
        }
    }

    return true
}