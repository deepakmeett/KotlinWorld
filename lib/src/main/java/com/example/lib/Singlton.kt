package com.example.lib

object SingltonClass{
    init {
        println("This is singleton class object and it will be created only one time")
    }
}


fun main() {
    println(SingltonClass)
    println(SingltonClass)
    println(SingltonClass)
}


