package com.example.lib.simple_programe

fun main() {
    val name = "racecar"
    println(isPalindrome(name))
}
fun isPalindrome(name: String): Boolean {
    var left = 0
    var right = name.length - 1
    while(left < right){
        if(name[left] != name[right]){
            return false
        }
        left++
        right--
    }
    return true

    //Kotlin collections used.
//        return name == name.reversed()
}