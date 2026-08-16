package com.example.lib.android_related.twoPointers

//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

fun main() {
    val myArray = intArrayOf(-1, 0)
    val target = -1
    println(twoSum2(myArray, target).toList())
}

fun twoSum2(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.size - 1

    while (l < r) {
        val lV = numbers[l]
        val rV = numbers[r]
        val sum = lV + rV
        if (sum == target) {
            return intArrayOf(l + 1, r + 1)
        }
        if (sum < target) l++
        if (sum > target) r--
    }
    return intArrayOf(-1, -1)
}
