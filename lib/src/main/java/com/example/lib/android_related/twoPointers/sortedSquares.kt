package com.example.lib.android_related.twoPointers

fun main() {
    val nums = intArrayOf(-4, -1, 0, 3, 10)
//    val nums = intArrayOf(-7, -3, 2, 3, 11)
    print(sortedSquares(nums).joinToString())
}

fun sortedSquares(nums: IntArray): IntArray {
    var l = 0
    var r = nums.size - 1
    val result = IntArray(nums.size)

    for (i in r downTo 0) {
        val leftSquare = nums[l] * nums[l]
        val rightSquare = nums[r] * nums[r]
        if (leftSquare > rightSquare) {
            result[i] = leftSquare
            l++
        } else {
            result[i] = rightSquare
            r--
        }
    }
    return result
}
