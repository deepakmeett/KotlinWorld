package com.example.lib.simple_programe

fun main() {
    var firstElement = 0
    var secondElement = 0
    var bwElement = 0
    val list = listOf(1, 3, 5, 7, 9, 10)
    for (i in list.indices) {
        if (i < list.size - 1) {
            firstElement = list[i]
            bwElement = firstElement + 1
        }
        if (i + 1 < list.size) {
            secondElement = list[i + 1]
        }

        if (bwElement in (firstElement + 1) until secondElement){
            println("Missing number is -> $bwElement")
        }

//        bwElement = 0
    }
}
