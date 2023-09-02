package com.example.lib.kotlin_concept

import java.util.*
import kotlin.reflect.KProperty

class Student{

    var firstName: String? by NameDelegate() // ----> this has same value

//    set(value) {                                            --------
//        if (value != null && value.length > 5) {                --------
//             field = value.trim().uppercase(Locale.ROOT)             --------> this has same value
//        }                                                       --------
//    }                                                       --------

    override fun toString(): String {
        return "$firstName"
    }
}

class NameDelegate{
    var formattedString: String? = null

    operator fun setValue(thisRef:Any?, properties: KProperty<*>, value: String?){
        if (value != null && value.length > 5) {
            formattedString = value.trim().uppercase(Locale.ROOT)
        }
    }

    operator fun getValue(thisRef:Any?, properties: KProperty<*>): String? {
        return formattedString
    }
}


fun main() {
    val student = Student()
    student.firstName = "   Deepak "
    print(student)

}


