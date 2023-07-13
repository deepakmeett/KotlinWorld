package com.example.lib

fun main() {
    val outer = OuterClass()
    val inner = outer.InnerClass()
    inner.printProperties()
}

class OuterClass {
    val outerProperty = "Outer Property"

    inner class InnerClass {
        private val innerProperty = "Inner Property"

        fun printProperties() {
            println(outerProperty) // Accessing outer property using implicit 'this'
            println(this.innerProperty) // Accessing inner property using 'this'
            println(this@OuterClass.outerProperty) // Accessing outer property using qualified 'this'
        }
    }
}





