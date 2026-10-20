package com.example.lib.android_related.binary

//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4

fun main() {
    val nums = intArrayOf(4, 5, 6, 7, 0, 1, 2)
    val target = 4
//    val nums = intArrayOf(1)
//    val target = 1
//    val nums = intArrayOf(1, 2, 3, 4, 5, 6)
//    val target = 7
    println(searchInRotatedSortedArray(nums, target))
}

fun searchInRotatedSortedArray(nums: IntArray, target: Int): Int {
    val high = nums.size - 1
    val minimum = findMinIndex(nums)
    return if (target >= nums[minimum] && target <= nums[high]) {
        binarySearchIndex(nums, target, minimum, high)
    } else {
        binarySearchIndex(nums, target, 0, minimum - 1)
    }
}

fun findMinIndex(nums: IntArray): Int {
    var l = 0
    var h = nums.size - 1

    while (l < h) {
        val mid = (l + h) / 2
        val mValue = nums[mid]
        val hValue = nums[h]
        if (mValue > hValue) {
            l = mid + 1
        } else {
            h = mid
        }
    }
    return h
}

fun binarySearchIndex(nums: IntArray, target: Int, l: Int, h: Int): Int {
    var low = l
    var high = h

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