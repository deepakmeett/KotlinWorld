package com.example.lib.dsa


fun main() {
    print("Reversed word: ")
    val value = "Deepak"
    for (i in value.length-1 downTo 0){
        print(value[i].uppercaseChar())
    }

    println()
    print("Reversed sentence: ")
    val value1 = "My name is Deepak Sahu"
    val v1 = value1.split(" ")
    for (i in v1.size-1 downTo 0){
        print(v1[i] + " ")
    }
}
