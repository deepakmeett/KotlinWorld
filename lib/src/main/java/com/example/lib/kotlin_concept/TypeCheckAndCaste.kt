package com.example.lib.kotlin_concept

fun main() {

    val obj = "Kotlin"

    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) { // same as !(obj is String)
        println("Not a String")
    } else {
        println(obj.length)
    }

    val num: Int? = obj as? Int // Unsafe cast
    println(num)


    //is and !is operators for if condition
    //"Unsafe" or "Safe" cast operator for single line expression
}