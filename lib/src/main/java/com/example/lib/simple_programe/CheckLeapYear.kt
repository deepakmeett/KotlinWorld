package com.example.lib.simple_programe

var isLeapYear = false

fun main() {
    val year = 2002

    val checkLeapYear: Boolean = if (stepOne(year)){
        if (stepTwo(year)){
            if(stepThree(year)){
                stepFour()
            }else{
                stepFive()
            }
        }else{
            stepFour()
        }
    }else{
        stepFive()
    }

    println(checkLeapYear)
}

fun stepOne(year: Int): Boolean {
    return year % 4 == 0
}

fun stepTwo(year: Int): Boolean {
    return year % 100 == 0
}

fun stepThree(year: Int): Boolean {
    return year % 400 == 0
}

fun stepFour(): Boolean {
    isLeapYear = true
    return isLeapYear
}

fun stepFive(): Boolean {
    isLeapYear = false
    return isLeapYear
}
