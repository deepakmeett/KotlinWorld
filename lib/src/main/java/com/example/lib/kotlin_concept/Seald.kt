package com.example.lib.kotlin_concept

//sealed class Mona {
//    data class Success(val data: String) : Mona()
//    data class Error(val data: String) : Mona()
//    object Loading : Mona()
//}
//
//fun getMona(): Mona {
//    return Mona.Success((100..1000).random().toString())
//}
//
//fun main() {
//    when (val mona = getMona()) {
//        is Mona.Error -> {
//            println(mona)
//        }
//
//        is Mona.Success -> {
//            println(mona)
//        }
//
//        Mona.Loading -> {
//            println(mona)
//        }
//    }
//}



sealed class Shape {
    abstract fun calculateArea(): Double
}

data class Circle1(val radius: Double) : Shape() {
    override fun calculateArea(): Double = Math.PI * radius * radius
}

data class Rectangle1(val width: Double, val height: Double) : Shape() {
    override fun calculateArea(): Double = width * height
}

data class Triangle(val base: Double, val height: Double) : Shape() {
    override fun calculateArea(): Double = 0.5 * base * height
}

fun main() {
    val circle = Circle1(5.0)
    val rectangle = Rectangle1(4.0, 6.0)
    val triangle = Triangle(3.0, 7.0)

    val shapes: List<Shape> = listOf(circle, rectangle, triangle)

    for (shape in shapes) {
        println("Area of ${shape.javaClass.simpleName}: ${shape.calculateArea()}")
    }
}
