package com.example.lib.android_related.twoPointers

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
    print(removeDuplicatesFromSortedArray2(nums))
}

fun removeDuplicatesFromSortedArray2(nums: IntArray): Int {
    if (nums.size <= 2) return nums.size

    var slow = 2
    for (fast in 2 until nums.size) {
        if (nums[fast] != nums[slow - 2]) {
            nums[slow] = nums[fast]
            slow++

        }
    }
    return slow
}
