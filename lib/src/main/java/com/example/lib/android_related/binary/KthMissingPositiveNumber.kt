package com.example.lib.android_related.binary

//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

fun main() {
    val nums = intArrayOf(2, 3, 4, 7, 11)
    val k = 2
    println(kthMissingPositiveNumber(nums, k))
}

fun kthMissingPositiveNumber(nums: IntArray, k: Int): Int {
    var low = 0
    var high = nums.size - 1

    while (low <= high) {
        val mid = (low + high) / 2

        val missing = nums[mid] - (mid + 1)

        if (missing < k) {
            low = mid + 1
        } else {
            high = mid - 1
        }
    }
    return low + k
}