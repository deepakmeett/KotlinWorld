package com.example.lib.android_related
// Input: nums = [6,0,8,2,1,5]
// Output: 4
// Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.

fun main() {
    val nums = intArrayOf(6,0,8,2,1,5)
//    val nums = intArrayOf(9, 8, 1, 0, 1, 9, 4, 0, 4, 1)
    println(
        maxWidthRamp(nums)
    )
}

fun maxWidthRamp(nums: IntArray): Int {
    var temp = 0
    val n = nums.size - 1
    var i = 0
    var j = n

    while (i < n) {
        while (j > i) {
            if (nums[i] <= nums[j]) {
                val t = j - i
                if (temp < t) {
                    temp = t
                }
                break
            }
            j--
        }
        i++
        j = n
    }
    return temp
}