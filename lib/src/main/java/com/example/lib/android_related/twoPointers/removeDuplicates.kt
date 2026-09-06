package com.example.lib.android_related.twoPointers

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    print(removeDuplicates(nums))
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var i = 0
    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
}
