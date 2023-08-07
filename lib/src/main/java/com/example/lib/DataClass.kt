package com.example.lib

fun main(){

    val user = NameAndNumber("Jack", 12345)
    val user1 = NameAndNumber("Jack", 12345)

    if (user == user1) {
        println("Oh yeah :-) it's equal")
    }else{
        println("Oh no :-( it's not equal")
    }

    if (user === user1) {
        println("Oh yeah :-) it's equal")
    }else{
        println("Oh no :-( it's not equal")
    }

//    'equals' method in custom classes to define custom equality comparisons based on your specific requirements.
    if (user.equals(user1)) {
        println("Oh yeah :-) it's equal")
    }else{
        println("Oh no :-( it's not equal")
    }


    //region Print objects of class
    println(user)
    //endregion

    //region Use of Copy keyword
    val user3 = user1.copy(name = "Rock")
    println(user3)
    //endregion

    //region Print last index from array
    val names = arrayOf("Data", "is", "very", "sensitive")
    println(names[names.size-1])
    //endregion
}

data class NameAndNumber(val name: String, val number: Int)