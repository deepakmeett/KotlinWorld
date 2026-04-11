package com.example.lib.simple_programe

fun main() {
    val words = listOf("eat", "tea", "tan", "ate", "nat", "bat")

    println(findAnagrams(words))
}
// Output: [[eat, tea, ate], [tan, nat], [bat]]}
//fun findAnagrams(words: List<String>): List<List<String>> {
//    val result = mutableListOf<MutableList<String>>()
//    val visited = BooleanArray(words.size)
//
//    for (i in words.indices) {
//        if (visited[i]) continue
//
//        val group = mutableListOf(words[i])
//        visited[i] = true
//
//        for (j in i + 1 until words.size) {
//            if (!visited[j] && isAnagram(words[i], words[j])) {
//                group.add(words[j])
//                visited[j] = true
//            }
//        }
//
//        result.add(group)
//    }
//
//    return result
//}
//
//fun isAnagram(a: String, b: String): Boolean {
//    return a.toCharArray().sorted() == b.toCharArray().sorted()
//}

fun findAnagrams(words: List<String>): List<List<String>> {
    return words.groupBy { word ->
        word.toCharArray().sorted().joinToString("")
    }.values.toList()
}