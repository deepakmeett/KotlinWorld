package com.example.lib.simple_programe

var secondIndex = 0
var firstIndex = 0

fun main() {
    val myArray = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(myArray, target)
    println(result.toList())
}

fun twoSum(myArray: IntArray, target: Int): IntArray {
    val intArray = intArrayOf(0, 0)
    for (i in myArray.indices) {
        firstIndex = myArray[i]
        if (i < myArray.size - 1) {
            secondIndex = myArray[i + 1]
            val tr = firstIndex + secondIndex

            if (tr == target) {
                intArray[i] = i
                intArray[i + 1] = i + 1
            }
        }
    }
    return intArray
}
