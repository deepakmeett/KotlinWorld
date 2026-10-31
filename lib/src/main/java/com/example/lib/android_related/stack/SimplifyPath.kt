package com.example.lib.android_related.stack

fun main() {
//    val s = "/home/"
//    val s = "/home//foo/"
//    val s = "/home/user/Documents/../Pictures"
//    val s = "/../"
    val s = "/.../a/../b/c/../d/./"
    println(simplifyPath(s))
}

fun simplifyPath(s: String): String {
    val stack = ArrayDeque<String>()
    val directories = s.split("/")

    for (char in directories) {
        if (char == "..") {
            if (stack.isNotEmpty()) {
                stack.removeLastOrNull()
            }
        }
        if (char != "." && char != ".." && char != "") {
            stack.addLast(char)
        }
    }
    return "/" + stack.joinToString("/")
}