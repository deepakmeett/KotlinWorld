package com.example.lib.simple_programe

class ComplexNumber(var real: Double, var img: Double)

fun sum(c1: ComplexNumber, c2: ComplexNumber): ComplexNumber {
    // creating a temporary complex number to hold the sum of two numbers
    val temp = ComplexNumber(0.0, 0.0)

    temp.real = c1.real + c2.real
    temp.img = c1.img + c2.img

    // returning the output complex number
    return temp
}

fun main() {
    val c1 = ComplexNumber(5.5, 4.0)
    val c2 = ComplexNumber(1.2, 3.5)
    val temp = sum(c1, c2)
    println("Sum is: ${temp.real} + ${temp.img}i")
}
