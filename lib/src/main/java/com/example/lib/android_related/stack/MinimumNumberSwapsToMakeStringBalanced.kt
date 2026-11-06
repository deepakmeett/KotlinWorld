package com.example.lib.android_related.stack


fun main() {
    val s = "][]["
//    val s = "]]][[["
//    val s = "[]"
//    val s = "]]]][[[["
//    val s = "][][]["
//    val s = "]]"
    println(minSwaps(s))
}

fun minSwaps(s: String): Int {
    val stack = ArrayDeque<Char>()

    for (char in s) {
        if (char == '[') {
            stack.addLast(char)
        } else if (stack.isNotEmpty()){
            stack.removeLast()
        }
    }
    return (stack.size + 1) / 2
}
