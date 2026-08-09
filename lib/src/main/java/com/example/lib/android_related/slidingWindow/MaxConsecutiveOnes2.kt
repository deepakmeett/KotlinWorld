package com.example.lib.android_related.slidingWindow

fun main() {
    val nums = intArrayOf(1, 0, 1, 1, 0)
    print(maxConsecutiveOnes2(nums))
}

fun maxConsecutiveOnes2(nums: IntArray): Int {
    var res = 0
    var count = 0
    var left = 0


    for (right in nums.indices) {
        count += nums[right]
        while (!(count == right - left + 1 || count == right - left)) {
            count -= nums[left]
            left++
        }
        res = maxOf(res, right - left + 1)
    }
    return res
}
