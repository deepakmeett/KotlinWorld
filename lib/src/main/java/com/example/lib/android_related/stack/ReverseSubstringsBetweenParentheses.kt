package com.example.lib.android_related.stack

// Input: s = "(ed(et(oc))el)"
// Output: "leetcode"
// Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

fun main() {
    val testCases = listOf(
//        "(abcd)",
//        "(u(love)i)",
        "(ed(et(oc))el)"
    )

    for (s in testCases) {
        println("Input:  $s")
        println("Output: ${reverseParentheses(s)}")
        println()
    }
}

fun reverseParentheses(s: String): String {
    val stack = ArrayDeque<Char>()

    for (ch in s) {
        if (ch == ')') {
            val temp = mutableListOf<Char>()
            // Collect characters until matching '('
            while (stack.isNotEmpty() && stack.last() != '(') {
                temp.add(stack.removeLast())
            }
            // Pop matching '('
            if (stack.isNotEmpty() && stack.last() == '(') {
                stack.removeLast()
            }
            // Push characters back in reversed order
            for (c in temp) {
                stack.addLast(c)
            }
        } else {
            stack.addLast(ch)
        }
    }

    return stack.joinToString("")
}

