package com.example.lib.android_related.slidingWindow

fun main() {
    val nums = intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0)
    val k = 2
    print(maxConsecutiveOnes3(nums, k))
}

fun maxConsecutiveOnes3(nums: IntArray, k: Int): Int {
    var res = 0
    var count = 0
    var left = 0

    for (right in nums.indices) {
        count += nums[right]
        while (count + k < right - left + 1) {
            count -= nums[left]
            left++
        }
        res = maxOf(res, right - left + 1)
    }
    return res
}
