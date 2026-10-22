package com.example.lib.android_related.binary

//Input: arr = [0,1,0]
//Output: 1

fun main() {
    val nums = intArrayOf(0, 1, 0)
//    val nums = intArrayOf(0, 2, 1, 0)
//    val nums = intArrayOf(0, 10, 5, 2)
//    val nums = intArrayOf(3, 4, 5, 1)
    println(peakIndex(nums))
}

fun peakIndex(nums: IntArray): Int {
    var l = 0
    var h = nums.size - 1
    var mid = 0

    while (l < h) {
        mid = (l + h) / 2
        val mValue = nums[mid]
        val hValue = nums[mid + 1]
        if (mValue < hValue) {
            l = mid + 1
        } else {
            h = mid
        }
    }
    return l
}
