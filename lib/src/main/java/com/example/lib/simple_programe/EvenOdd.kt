package com.example.lib.simple_programe


fun main() {
    val list = mutableListOf(7, 6, 7, 8, 9)

    for (i in list.indices) {
        if (list[i]%2 == 0){
            println("even")
        }else{
            println("odd")
        }
    }
}