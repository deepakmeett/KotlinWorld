package com.example.lib.kotlin_concept

data class ScopePerson(var name: String, var age: Int, var city: String = "New York")

class ScopeFunctionsDemo {

    fun demonstrateScopeFunctions() {
        val person: ScopePerson? = getNullablePerson()

        // 1. let
        // Context object: it, Return value: lambda result
        // Common use: null safety or transforming data
        val nameLength = person?.let {
            println("let: Context object is 'it': $it")
            it.name.length
        }
        println("let result (name length): $nameLength")

        // 2. run
        // Context object: this, Return value: lambda result
        // Common use: object configuration and computing the result
        val result = person?.run {
            println("run: Context object is 'this': $this")
            "The person is $name from $city"
        }
        println("run result: $result")

        // 3. with
        // Context object: this, Return value: lambda result
        // Common use: calling multiple methods on an object
        // Usually used on non-nullable objects
        val nonNullPerson = person ?: ScopePerson("Guest", 0)
        val withResult = with(nonNullPerson) {
            println("with: Context object is 'this': $this")
            "Name: $name, Age: $age"
        }
        println("with result: $withResult")

        // 4. apply
        // Context object: this, Return value: context object itself
        // Common use: object configuration
        val appliedPerson = nonNullPerson.apply {
            city = "New York"
            println("apply: Context object is 'this': $this")
        }
        println("apply result: $appliedPerson")

        // 5. also
        // Context object: it, Return value: context object itself
        // Common use: additional actions like logging
        val alsoPerson = nonNullPerson.also {
            println("also: Context object is 'it': $it")
        }
        println("also result: $alsoPerson")
    }

    private fun getNullablePerson(): ScopePerson? = ScopePerson("John", 25)
}

fun main() {
    ScopeFunctionsDemo().demonstrateScopeFunctions()
}
