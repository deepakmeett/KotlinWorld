package com.example.lib.android_related.stack

fun main() {
    val s = arrayOf("2", "1", "+", "3", "*")
//    val s = arrayOf("4", "13", "5", "/", "+")
//    val s = arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")
//    val s = arrayOf("0", "3", "/")
    println(evaluateReversePolishNotation(s))
}

fun evaluateReversePolishNotation(tokens: Array<String>): Int {
    val stack = ArrayDeque<Int>()

    for (token in tokens) {
        when (token) {
            "+" -> {
                val num1 = stack.removeLast()
                val num2 = stack.removeLast()
                stack.addLast(num2 + num1)
            }
            "-" -> {
                val num1 = stack.removeLast()
                val num2 = stack.removeLast()
                stack.addLast(num2 - num1)
            }
            "*" -> {
                val num1 = stack.removeLast()
                val num2 = stack.removeLast()
                stack.addLast(num2 * num1)
            }
            "/" -> {
                val num1 = stack.removeLast()
                val num2 = stack.removeLast()
                stack.addLast(num2 / num1)
            }
            else -> {
                stack.addLast(token.toInt())
            }
        }
    }
    return stack.last()
}