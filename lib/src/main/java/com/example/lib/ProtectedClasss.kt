package com.example.lib

open class MyBaseClass {
    protected val myProtectedField = "Hello, protected field!"
}

class MySubClass : MyBaseClass() {
    fun printProtectedField() {
        println(myProtectedField)
    }
}

fun main() {
    val obj = MySubClass()
    obj.printProtectedField() // Prints "Hello, protected field!"
//    println(obj.myProtectedField) // Compilation error: 'myProtectedField' is protected and cannot be accessed from outside its class hierarchy
}
