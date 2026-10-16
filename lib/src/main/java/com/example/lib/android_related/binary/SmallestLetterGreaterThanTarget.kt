package com.example.lib.android_related.binary

//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.


fun main() {
    val letters = charArrayOf('c', 'f', 'j')
//    val target = 'a'
//    val target = 'c'
    val target = 'z'
    println(smallestLetterGreaterThanTarget(letters, target))
}

fun smallestLetterGreaterThanTarget(letters: CharArray, target: Char): Char {
    if (target > letters[letters.size - 1] || target < letters[0]) {
        return letters[0]
    }

    var low = 0
    var high = letters.size - 1
    var ans = 0

    while (low <= high) {
        val mid = (low + high) / 2

        if (letters[mid] <= target) {
            low++
        } else {
            ans = mid
            high--
        }
    }
    return letters[ans]
}