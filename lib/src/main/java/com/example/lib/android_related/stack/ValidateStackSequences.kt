package com.example.lib.android_related.stack

fun main() {
    val pushed = intArrayOf(1, 2, 3, 4, 5)
    val popped = intArrayOf(4, 5, 3, 2, 1)
//    val popped = intArrayOf(4, 3, 5, 1, 2)
    println(validateStackSequences(pushed, popped))
}

fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    val stack = ArrayDeque<Int>()

    val pushedSize = pushed.size
    var i = 0
    var j = 0

    while (i < pushedSize && j < pushedSize) {
        stack.addLast(pushed[i])
        while (stack.isNotEmpty() && j < pushedSize && stack.last() == popped[j]) {
            stack.removeLast()
            j++
        }
        i++
    }

    return stack.isEmpty()
}