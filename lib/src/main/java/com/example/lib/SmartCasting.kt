package com.example.lib

fun main() {

    val circle = Circle()
    val rectangle = Rectangle()

    val shape: Array<Any> = arrayOf(circle, rectangle)
    for (any in shape) {
        if (any is Circle) {
            any.radius() // ----> we are not getting wight and height because of smart casting
        } else if (any is Rectangle){
            any.height() // ----> we are not getting diameter and radius because of smart casting
        }
    }
}

class Circle() {
    fun diameter() {}
    fun radius() {}
}

class Rectangle() {
    fun width() {}
    fun height() {}
}




