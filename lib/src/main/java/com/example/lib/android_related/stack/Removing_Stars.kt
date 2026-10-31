package com.example.lib.android_related.stack

fun main() {
    val s = "leet**cod*e"
//    val s = "erase*****"
    println(removingStars(s))
}

fun removingStars(s: String): String {
    val stack = ArrayDeque<Char>()
    for (char in s) {
        if (char == '*') {
            if (stack.isNotEmpty()) {
                stack.removeLastOrNull()
            }
        } else {
            stack.addLast(char)
        }
    }
    return stack.joinToString("")
}