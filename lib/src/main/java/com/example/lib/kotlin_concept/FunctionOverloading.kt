package com.example.lib.kotlin_concept

fun main() {

    //region Example 1
    val environment = "Hot"
    val weather = if (environment == "Hot") "Summer" else "Winter"
    println(weather)
    //endregion

    // region Example 2
    fun getMax(a: Int, b: Int) = if (a > b) a else b
     println(getMax(3, 4))
    //endregion

    // region Example 3
    fun getMax(a: Int, b: Int, c: Int) =
        when {
            a >= b && a >= c -> a
            b >= a && b >= c -> b
            else -> c
        }
    println(getMax(33, 43, 7))
    //endregion

}




