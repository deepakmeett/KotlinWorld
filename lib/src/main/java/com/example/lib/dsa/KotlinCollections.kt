package com.example.lib.dsa

fun main() {
//    val list = listOf(3, 5, 3, 2, 5, 5, 1)

//    val newList = list.groupingBy { it }.eachCount().filter { it.value > 1 }.keys.sorted().toList() // find the duplicate
//    val newList = list.toSet().sorted() // remove the duplicate
//    val newList = list.maxByOrNull { it } // find the max num

//    val list1 = listOf(1, 2, 3)
//    val list2 = listOf(3, 4, 5)
//    val l1 = list1 + list2
//    val newList = l1.toSet().sorted()

//    val list = listOf(10, 20, 30, 40, 50)
//    val newList = list.distinct().sortedDescending().getOrNull(1) // find the second highest num

//    val list = listOf(1, 2, 3, 4, 5, 6)
//    val newList = list.filter { it % 2 == 0 } // find the even num

//    val list = listOf("hello", "world")
//    val newList = list.map { it.uppercase() } // make it uppercase

//    val list = listOf(1, 2, 3)
//    val list1 = listOf(2, 3, 4)
//    val newList = list.sorted() == list1.sorted() // checking two list are equal

//    val list = listOf(1, 2, 3, 4)
//    val list1 = listOf(3, 4, 5, 6)
//    val newList = list.filterNot { it in list1 } // find the difference between two lists.

//    val list = listOf("apple", "banana", "apricot", "blueberry")
//    val newList = list.groupBy { it.first() } //grouping with the initials

//    val list = listOf("apple", "kiwi", "banana")
//    val newList = list.sortedBy { it.length } //sorting by its length

//    val list = listOf(1 to "A", 2 to "B", 3 to "C")
//    val map = list.toMap() // pair into map
//    print(map)

//    val list = listOf("hello", "world", "KotlinProgramming")
//    val newList = list.maxOfOrNull { it.length } // find the longest word length

//    val list = listOf(1, 2, 3, 4, 5)
//    var n = 0
//    list.map { n += it }
//    println(n)  // to sum all the element

//    val list = listOf(1, 2, 3, 4, 5)
//    val newList = list.reduce{ acc, num -> acc + num} // to sum all the element

//    val list = listOf("madam", "hello", "racecar")
//    val palindromes = list.filter { it == it.reversed() } // find all the palindrome

//    val name = "swiss"
//    val newList = name.groupingBy { it }.eachCount().filter { it.value == 1 }.keys.toList().getOrNull(0) // Find the first non-repeating character in a string

//    val list = listOf(1, 2, 3, 4, 5, 6)
//    val newList = list.shuffled() // shuffle a list

//    val list = listOf("apple", "boy", "cat")
//    val newList = list.filter { it.contains("a") } // filter containing only "a" character

//    val list = listOf(1, 2, 3, 4, 4, 5, 5)
//    val newList = list.groupingBy { it }.eachCount().filter { it.value > 1 }.keys

//    val list = listOf(3, 5, 4, 3, 2, 5, 7)
//    val newList = list.groupingBy { it }.eachCount().filter { it.value > 1 }.keys.first() // first repeated element

//    val list = listOf(1, 2, 3, 4, 4, 5, 5)
//    val newList = list.toSet().sortedDescending().getOrNull(1)

//    val list = listOf("This", "is", "my", "laptop")
//    val newList = list.maxByOrNull { it.length}

//    val list1 = listOf(1, 2, 3, 4)
//    val list2 = listOf(3, 4, 5, 6)
//    val newList1 = list1 + list2
//    val newList = newList1.groupingBy { it }.eachCount().filter { it.value > 1 }.keys
//    val newList = list1.intersect(list2)



//    val list = listOf("Joey", "Monika", "Phoebe", "Chandler", "Ross", "Rachel")
//    val newList = list.sortedBy { it } // sorting by alphabetical order

//    val sentence = "Welcome to BeginnersBook"
//    val wordList = sentence.split(" ").map { it.reversed() }
//    println(wordList)


//    var start = 0
//
//    for (i in 0..sentence.length) {
//        if (i == sentence.length || sentence[i] == ' ') {
//            // Reverse the word between start and i-1
//            for (j in i - 1 downTo start) {
//                print(sentence[j])
//            }
//            if (i != sentence.length) {
//                print(" ") // Print space between words
//            }
//            start = i + 1 // Move start to the next word
//        }
//    }
}














