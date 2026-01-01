package com.example.lib.simple_programe

var secondIndex = 0
var firstIndex = 0

fun main() {
//    val myArray = intArrayOf(2, 7, 11, 15)
//    val target = 9
//    val result = twoSum(myArray, target)
//    println(result.toList())

//    Input 000111223344
//    Outpit 1234____

    val arr = intArrayOf(0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

    var v = 1
    for (i in arr.indices) {
        if (arr[i] != 0){
            if (v != i){
                arr[v] = arr[i]
            }
            v++
        }
    }

    print(arr.toList())
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
