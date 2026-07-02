package com.example.lib.android_related

// Input: nums = [3,5,2,3]
// Output: 7
// Explanation: The elements can be paired up into pairs (3,3) and (5,2).
// The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.

fun main() {
    val nums = intArrayOf(3, 5, 2, 3)
    println(minMaxPair(nums))
}

fun minMaxPair(nums: IntArray): Int {
    val sn = nums.sorted()

    var l = 0
    var r = sn.size - 1

    var result = 0

    while (l <= r) {
        result = maxOf(result, sn[l] + sn[r])
        l++
        r--
    }

    return result
}
