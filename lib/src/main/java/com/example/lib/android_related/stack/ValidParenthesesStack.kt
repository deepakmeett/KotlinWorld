package com.example.lib.android_related.stack

import java.util.Stack

fun main() {
    val s = "()"
//    val s = "()[]{}"
//     val s = "(]"
//     val s = "([])"
//    val s = "([)]"
//    val s = "]"
//    val s = ")(){}"
    println(checkParentheses(s))
}

fun checkParentheses(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    for (char in s) {

        when (char) {
            '(', '{', '[' -> stack.addLast(char)
            ')' -> if (stack.removeLastOrNull() != '(') return false
            '}' -> if (stack.removeLastOrNull() != '{') return false
            ']' -> if (stack.removeLastOrNull() != '[') return false
        }
    }
    return stack.isEmpty()
}