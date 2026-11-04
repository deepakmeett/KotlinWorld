package com.example.lib.android_related.stack


fun main() {
    val s = "aababbab"
//    val s = "bbaaaaabb"
    println(minimumDeletions(s))
}

fun minimumDeletions(s: String): Int {
    var res = 0
    val stack = ArrayDeque<Char>()
    for (i in s) {
        var add = true

        if (stack.isNotEmpty() && stack.last() == 'b' && i == 'a') {
            stack.removeLast()
            add = false
            res++
        }
        if (add) {
            stack.addLast(i)
        }
    }
    return res
}
