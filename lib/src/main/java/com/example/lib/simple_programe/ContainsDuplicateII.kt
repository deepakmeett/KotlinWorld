package com.example.lib.simple_programe

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    val k = 3
    println(containsNearbyDuplicate(nums, k))
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        if (map.containsKey(nums[i])) {
            val prevInd = map[nums[i]]!!
            if (i - prevInd <= k) {
                return true
            }
        }
        map[nums[i]] = i
    }
    return false
}
