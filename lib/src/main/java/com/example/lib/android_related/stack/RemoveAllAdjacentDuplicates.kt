package com.example.lib.android_related.stack

fun main() {
//    val s = "abbaca"
    val s = "azxxzy"
    println(removeAllAdjacentDuplicates(s))
}

fun removeAllAdjacentDuplicates(s: String): String {
    val stack = ArrayDeque<Char>()

    var c = 0
    while (c < s.length){
        if (stack.isNotEmpty() && stack.last() == s[c]) {
            stack.removeLast()
        } else {
            stack.addLast(s[c])
        }
        c++
    }
    return stack.joinToString("")
}