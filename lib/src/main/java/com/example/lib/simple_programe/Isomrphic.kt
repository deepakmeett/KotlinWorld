package com.example.lib.simple_programe

fun main() {
    val s = "foo"
    val t = "bar"
    println(isIsomorphic(s, t))
}

fun isIsomorphic(s: String, t: String): Boolean{
    if (s.length != t.length) return false

    val mp = mutableMapOf<Char, Char>()
    for(i in 0..s.length - 1){
        val valS = s[i]
        val valT = t[i]
        if(mp.containsKey(valS)){
            if(mp[valS] != valT){
                return false
            }
        } else{
            if(mp.containsValue(valT)){
                return false
            }
            mp.put(valS, valT)
        }
    }

    return true
}