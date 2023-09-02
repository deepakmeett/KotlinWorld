package com.example.lib.kotlin_concept

fun main() {
//    println("Money")
//    myMethod()
//    println("Love")


    doSomething {
        println("Inside block")
    }
}

inline fun myMethod() {
    println("Sex")
}

inline fun doSomething(block: () -> Unit) {
    println("Before block")
    block()
    println("After block")
}




