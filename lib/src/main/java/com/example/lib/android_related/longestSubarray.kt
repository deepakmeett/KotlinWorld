package com.example.lib.android_related

fun main() {
//    val nums = intArrayOf(1, 1, 0, 1)
    val nums = intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1)
//    val nums = intArrayOf(1, 1, 1)
    println(longestSubarray(nums))
}

fun longestSubarray(nums: IntArray): Int {
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
