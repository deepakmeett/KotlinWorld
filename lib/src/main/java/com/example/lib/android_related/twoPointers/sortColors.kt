package com.example.lib.android_related.twoPointers

fun main() {
    val nums = intArrayOf(2, 0, 2, 1, 1, 0)
//    val nums = intArrayOf(2, 0, 1)
    sortColors(nums)
}

fun sortColors(nums: IntArray) {
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (nums[i] < nums[j]) {
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
            }
        }
    }

    print(nums.joinToString())
}
