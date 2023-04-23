package com.example.lib

import java.lang.Integer.sum


fun main() {
    println(sum(12, 50))

    //region Val cannot be reassigned example
//    val a: Int = 2
//    a = 4
//    print(a)
    //endregion

    withoutReturnType(1)
    withoutReturnType(2)
    println()
    withReturnType(1)
    withReturnType(2)
    withReturnType(3)
    println()

    checkListData()
}

fun checkListData() {

    val cakes = listOf("Carrot", "Cheese", "Chocolate")

    for (cake in cakes) {
        println(cake)
    }
}

fun withoutReturnType(obj: Any) {
    when (obj) {
        1 -> println("withoutReturnType : Oh yeah")
        2 -> println("withoutReturnType : Okay then")
    }
}

fun withReturnType(obj: Any): Any {
    return when (obj) {
        1 -> println("withReturnType : Oh yeah")
        2 -> println("withReturnType : Okay then")
        else -> println("withReturnType : Else part")
    }
}


