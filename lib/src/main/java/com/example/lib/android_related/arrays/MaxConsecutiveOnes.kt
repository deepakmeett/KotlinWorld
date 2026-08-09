package com.example.lib.android_related.arrays

fun main() {
    val nums = intArrayOf(1, 0, 1, 1, 0, 1)
    print(maxConsecutiveOnes(nums))
}

fun maxConsecutiveOnes(nums: IntArray): Int {
    var res = 0
    var count = 0

    for (i in nums.indices) {
        if (nums[i] == 1) {
            count++
        }else{
            count = 0
        }
        res = maxOf(res, count)
    }
    return res
}
