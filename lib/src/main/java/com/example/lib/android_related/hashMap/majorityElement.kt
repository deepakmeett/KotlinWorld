package com.example.lib.android_related.hashMap

fun main() {
    val nums = intArrayOf(3, 2, 3)
    println("HashMap solution: ${majorityElement(nums)}")
    println("Boyer-Moore solution: ${majorityElementBoyerMoore(nums)}")
}

fun majorityElement(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    for (i in nums) {
        map[i] = map.getOrDefault(i, 0) + 1
    }

    var maxVal = Int.MIN_VALUE // Handles negative numbers too
    var maxKey: String? = null

    for ((key, value) in map) {
        if (value > maxVal) {
            maxVal = value
            maxKey = key.toString()
        }
    }
    return maxKey?.toInt() ?: 0
//    return map.maxByOrNull { it.value }!!.key}
}
/**
 * Alternative: Boyer-Moore Voting Algorithm (O(N) Time, O(1) Space)
 */
fun majorityElementBoyerMoore(nums: IntArray): Int {
    var candidate = 0
    var count = 0

    for (num in nums) {
        if (count == 0) {
            candidate = num
        }
        count += if (num == candidate) 1 else -1
    }

    return candidate
}
