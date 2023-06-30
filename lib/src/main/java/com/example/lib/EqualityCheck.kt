package com.example.lib

fun main() {
    //Structural Equality:
    val a = "Hello"
    val b = "Hello"
    println(a == b) // true

    val c = "Hello"
    val d = "hello"
    println(c == d) // false


   //Referential Equality:
    val e = Person("John Doe")
    val f = e
    println(e === f) // true

    val g = Person("John Doe")
    val h = Person("John Doe")
    println(g === h) // false
}




