package com.example.lib.android_related

//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem constraint.

fun main() {
// Normal case
    val target = 4
    val nums = intArrayOf(1, 4, 4)
// Expected: 2

// Single element equals target
// val target = 5
// val nums = intArrayOf(5)
// Expected: 1

// Single element greater than target
// val target = 5
// val nums = intArrayOf(8)
// Expected: 1

// No valid subarray
// val target = 11
// val nums = intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)
// Expected: 0

// Minimum window at the beginning
// val target = 7
// val nums = intArrayOf(7, 1, 2, 3)
// Expected: 1

// Minimum window at the end
// val target = 7
// val nums = intArrayOf(1, 2, 3, 7)
// Expected: 1

// Repeated numbers
// val target = 6
// val nums = intArrayOf(2, 2, 2, 2)
// Expected: 3

// Window shrinks multiple times
// val target = 8
// val nums = intArrayOf(2, 3, 1, 2, 4, 3)
// Expected: 3

// Target reached only near the end
// val target = 15
// val nums = intArrayOf(1, 2, 3, 4, 5)
// Expected: 5

// Array of size 1 (valid)
// val target = 1
// val nums = intArrayOf(1)
// Expected: 1

// Array of size 1 (invalid)
// val target = 2
// val nums = intArrayOf(1)
// Expected: 0

//  Entire array is required
//    val target = 10
//    val nums = intArrayOf(2, 3, 1, 4)
// Expected: 4

    print(minimumSizeSubarraySize(target, nums))
}

fun minimumSizeSubarraySize(target: Int, nums: IntArray): Int {
    var i = 0
    var j = 0
    var mL = Int.MAX_VALUE

    var sum = 0

    while (j < nums.size) {
        sum += nums[j]
        while (sum >= target) {
            val total = j - i + 1
            mL = minOf(mL, total)
            sum -= nums[i]
            i++
        }
        j++
    }

    return if (mL == Int.MAX_VALUE) 0 else mL
}