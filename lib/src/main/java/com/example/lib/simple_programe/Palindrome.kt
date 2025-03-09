package com.example.lib.simple_programe

fun main() {

    val word = "abccba"
    val list = mutableListOf<String>()
    var char = ""
    val stBuilder = StringBuilder()

    for (i in 0..word.length){
        if (word.length > i) {
            char = word[(word.length - 1) - i].toString()
            list.add(char)
        }
    }

    for (j in 0..list.size){
        if (list.size > j) {
            stBuilder.append(list[j])
        }
    }

    if (word == stBuilder.toString()) {
        println("$word is Palindrome")
    }else{
        println("$word is not Palindrome")
    }
}