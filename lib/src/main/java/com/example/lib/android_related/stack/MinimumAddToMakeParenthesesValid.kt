package com.example.lib.android_related.stack

fun main() {
    val s = "())"
//    val s = "((("
    println(minAddToMakeValid(s))
}

fun minAddToMakeValid(s: String): Int {
    if (s.isEmpty()) {
        return 0
    }

    val stack = ArrayDeque<Char>()

    for (char in s) {
        var add = true
        if (stack.isNotEmpty() && stack.last() == '(' && char == ')') {
            stack.removeLast()
            add = false
        }

        if (add) {
            stack.addLast(char)
        }
    }
    return stack.size
}
