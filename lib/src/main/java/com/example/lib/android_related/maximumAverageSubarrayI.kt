package com.example.lib.android_related

fun main() {

    val nums = intArrayOf(1, 12, -5, -6, 50, 3)
    val k = 4
    println(maximumAverageSubarrayI(nums, k))
}

fun maximumAverageSubarrayI(nums: IntArray, k: Int): Double {
    var res: Double
    var window = 0.0

    for (i in 0 until k) {
        window += nums[i]
    }
    res = window / k

    for (j in k until nums.size) {
        window += nums[j] - nums[j - k]
        res = maxOf(res, window / k)
    }

    return res
}