package com.example.lib.android_related

import kotlin.text.iterator


fun main() {
    val name = "swiss"
    val mm = mutableMapOf<Char, Int>()
    for(i in name){
        mm[i] = (mm[i] ?: 0) +1
    }

    print(mm)
    for(i in name){
        if(1 == mm[i]){
            print(i)
            break
        }
    }
}