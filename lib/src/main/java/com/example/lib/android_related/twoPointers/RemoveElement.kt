package com.example.lib.android_related.twoPointers

fun main() {
//    val nums = intArrayOf(3, 2, 2, 3)
    val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val k = 2
    println(removeElement(nums, k))
}

fun removeElement(nums: IntArray, k: Int): Int {
    var i = 0
    for (j in nums.indices) {
        if (nums[j] != k) {
            nums[i] = nums[j]
            i++
        }
    }
    return i
}

