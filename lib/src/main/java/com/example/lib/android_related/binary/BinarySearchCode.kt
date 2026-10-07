package com.example.lib.android_related.binary

//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4

fun main() {
    val nums = intArrayOf(-1, 0, 3, 5, 9, 12)
    val target = 5
    println(binarySearchCode(nums, target))
}

fun binarySearchCode(nums: IntArray, target: Int): Int {
    var low = 0
    var high = nums.size - 1

    while (low <= high) {
        val mid = (low + high) / 2

        if (nums[mid] == target) {
            return mid
        } else if (nums[mid] < target) {
            low = mid + 1
        } else {
            high = mid - 1
        }
    }
    return -1
}