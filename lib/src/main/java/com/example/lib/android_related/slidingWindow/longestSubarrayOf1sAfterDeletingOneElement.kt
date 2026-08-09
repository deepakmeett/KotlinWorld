package com.example.lib.android_related.slidingWindow

fun main() {
//    val nums = intArrayOf(1, 1, 0, 1)
    val nums = intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1)
//    val nums = intArrayOf(1, 1, 1)
    println(longestSubarrayOf1sAfterDeletingOneElement(nums))
}

fun longestSubarrayOf1sAfterDeletingOneElement(nums: IntArray): Int {
    var res = 0
    var zeroCount = 0
    var i = 0
    for (j in nums.indices) {
        if (nums[j] == 0) {
            zeroCount++
            while (zeroCount > 1) {
                if (nums[i] == 0) {
                    zeroCount--
                }
                i++
            }
        }
        res = maxOf(res, j - i)
    }


    if (zeroCount == 0) {
        return nums.size - 1
    }

    return res
}
