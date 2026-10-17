package com.example.lib.android_related.binary

//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.

fun main() {
    val nums = intArrayOf(3, 4, 5, 1, 2)
    println(findMin(nums))
}

fun findMin(nums: IntArray): Int {
    var l = 0
    var h = nums.size - 1

    while (l < h) {
        val mid = (l + h) / 2
        val mValue = nums[mid]
        val hValue = nums[h]
        if (mValue > hValue) {
            l = mid + 1
        } else {
            h = mid
        }
    }
    return nums[h]
}
