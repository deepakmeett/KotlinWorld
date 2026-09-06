package com.example.lib.android_related.twoPointers

//Input: people = [3,2,2,1], limit = 3
//Output: 3
//Explanation: 3 boats (1, 2), (2) and (3)

fun main() {
    val people = intArrayOf(1, 2)
//    val people = intArrayOf(3, 2, 2, 1)
//    val people = intArrayOf(3, 5, 3, 4)
//    val people = intArrayOf(7, 3, 2)
    val limit = 3
    println(numRescueBoats(people, limit))
}

fun numRescueBoats(people: IntArray, limit: Int): Int {
    people.sort()

    var l = 0
    var r = people.size - 1
    var count = 0

    while (l <= r) {
        if (people[l] + people[r] <= limit) {
            l++
            r--
        } else {
            r--
        }
        count++
    }
    return count
}

