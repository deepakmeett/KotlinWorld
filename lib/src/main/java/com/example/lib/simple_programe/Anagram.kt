package com.example.lib.simple_programe

fun main() {
    val s = "anagram"
    val t = "nagaram"
    println(isAnagram(s, t))
}
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val map = mutableMapOf<Char, Int>()
    for (c in s) {
        map[c] = map.getOrDefault(c, 0) + 1
    }
    for (c in t) {
        if (!map.containsKey(c)) return false

        val count = map[c] ?: return false // Get count or return false if null
        map[c] = count - 1
        if (map[c] == 0) {
            map.remove(c)
        }
    }
    return map.isEmpty()
}