package com.example.lib.kotlin_concept


fun main() {
    val pr1 = Person("John", 25)
    val pr2 = Person("Jane")
    val pr3 = Person()
    (pr1.printValues())
    (pr2.printValues())
    (pr3.printValues())

    //region 2nd point example
//    val person1 = Person("John", 30) // Using primary constructor
//    val person2 = Person("Jane") // Using secondary constructor with default age value
//    val person3 = Person("Bob", 25, "+1-123-456-7890") // Using secondary constructor with phone parameter
    //endregion

    //region 3rd point example
    //    val person1 = Person("John", 30, "New York") // Using primary constructor
//    val person2 = Person("Jane", 25) // Using secondary constructor with default city value
//
//// This will throw an IllegalArgumentException
//    val person3 = Person("Bob", -5)
    //endregion

//    Here are some scenarios where secondary constructors can be useful:
//    1. Providing default values: A secondary constructor can provide default values for properties that are not defined in the primary constructor. This can simplify the creation of instances of the class.
//    2. Overloading constructors: A secondary constructor can provide an overloaded version of the primary constructor. This can be useful when you need to create instances of the class with different sets of parameters.
//    3. Initialization logic: A secondary constructor can be used to initialize properties that cannot be initialized in the primary constructor. For example, if you need to perform some complex calculations or data manipulation before initializing the properties, a secondary constructor can be used.
//    4. A class can have one or more secondary constructors.
//    5. Secondary constructors are defined inside the class body and are prefixed with the constructor keyword.
}

class Person(private val name: String = "David", private val age: Int) {

    //region 1st point example
    // Secondary constructor with default value for age
    constructor(name: String = "David") : this(name, 0)

    fun printValues(){
        print(name)
        println(age)
    }
    //endregion

    //region 2nd point example
    //    // Secondary constructor with only name parameter
//    constructor(name: String) : this(name, 0)
//
//    // Secondary constructor with additional phone parameter
//    constructor(name: String, age: Int, phone: String) : this(name, age) {
//        // Initialization logic for phone property
//        this.phone = phone
//    }
//
//    var phone: String? = null
    //endregion

    //region 3rd point example
    // Secondary constructor with only name and age parameters
//    constructor(name: String, age: Int) : this(name, age, "Unknown") {
//        // Perform initialization logic
//        if (age < 0) {
//            throw IllegalArgumentException("Age cannot be negative")
//        }
//    }
    //endregion


}


