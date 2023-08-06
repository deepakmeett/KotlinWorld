package com.example.lib

sealed class Mona {
    data class Success(val data: String) : Mona()
    data class Error(val data: String) : Mona()
    object Loading : Mona()
}

fun getMona(): Mona {
    return Mona.Success((100..1000).random().toString())
}

fun main() {
    when (val mona = getMona()) {
        is Mona.Error -> {
            println(mona)
        }

        is Mona.Success -> {
            println(mona)
        }

        Mona.Loading -> {
            println(mona)
        }
    }
}
