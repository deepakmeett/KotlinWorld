package com.example.lib.simple_programe


fun main() {
    val input = "abcazdefgxy"
    val ml = mutableListOf<String>()
    var word = ""

    for(i in input.indices){
        if (i < input.length - 1) {
            if (input[i] < input[i + 1]){
                word += input[i]
            }else{
                ml.add(word)
                word = ""
            }
        }
    }
    word += input.last().toString()
    ml.add(word)

    var res = ml[0]
    for(i in ml){
        if (res.length < i.length){
            res = i
        }
    }

    print(res)

}