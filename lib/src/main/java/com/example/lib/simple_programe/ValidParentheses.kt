package com.example.lib.simple_programe

fun main() {
//     val s = "()"
//    val s = "()[]{}"
//     val s = "(]"
//     val s = "([])"
     val s = "([)]"

    val ml = mutableListOf<Char>()

    for(i in s.indices){
        val indexVal = s[i]
        if(indexVal == '(' || indexVal == '{' || indexVal == '[' ){
            ml.add(indexVal)
        }else if(indexVal == ')' || indexVal == '}' || indexVal == ']' ){
            if(ml.isNotEmpty()){
                if ((ml.last() == '(' && indexVal == ')') ||
                    (ml.last() == '{' && indexVal == '}') ||
                    (ml.last() == '[' && indexVal == ']')) {
                    ml.removeAt(ml.lastIndex) // pop
                }
            }
        }
    }

    print(ml)

    if(ml.isEmpty()){
        print("Valid")
    }else{
        print("Not valid")
    }
}