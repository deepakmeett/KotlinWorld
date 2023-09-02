package com.example.lib.kotlin_concept

fun main() {

    val box = Box(10, 10, 10)
    val content = box.Content("This is not a real content ").printContent()
    println(content)

    val content1 = box.Content("This is not a real content ").printBoxInfo()
    println(content1)


}

class Box(val width: Int, val length: Int, val height: Int) {

    //If we want to access inner class's fun from outer class object then we can use "inner" class

    inner class Content(private val content: String){

        fun printBoxInfo(){
            println("$width, $length, $height")
        }

        fun printContent(){
            print(content)
        }
    }

}


