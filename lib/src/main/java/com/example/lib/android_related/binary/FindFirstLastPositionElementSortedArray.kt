package com.example.lib.android_related.binary

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

fun main() {
    val nums = intArrayOf(5, 7, 7, 8, 8, 10)
    val target = 8

//    val nums = intArrayOf(5, 7, 7, 8, 8, 10)
//    val target = 6

//    val nums = intArrayOf()
//    val target = 0

    firstLastPosition(nums, target).contentToString()

}

fun firstLastPosition(nums: IntArray, target: Int): IntArray {
    val first = findFirstLastPositionElementSortedArray(nums, target, true)
    if (first == -1) {
        return intArrayOf(-1, -1)
    }
    val last = findFirstLastPositionElementSortedArray(nums, target, false)
    if (last == -1) {
        return intArrayOf(-1, -1)
    }
    return intArrayOf(first, last)
}


fun findFirstLastPositionElementSortedArray(nums: IntArray, target: Int, isFirst: Boolean): Int {
    var low = 0
    var high = nums.size - 1

    var res = -1

    while (low <= high) {
        val mid = (low + high) / 2

        if (nums[mid] == target) {
            if (isFirst) {
                high = mid - 1
            } else {
                low = mid + 1
            }
            res = mid
        } else if (nums[mid] < target) {
            low = mid + 1
        } else {
            high = mid - 1
        }
    }
    return res
}

