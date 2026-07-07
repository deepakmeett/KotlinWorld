package com.example.lib.android_related

fun main() {
    val nums = intArrayOf(2, 5, 4, 3)
//    val nums = intArrayOf(3,2,2,5,4)
//    val nums = intArrayOf(1, 2, 3, 2)
    println(longestBalancedSubstring(nums))
}

fun longestBalancedSubstring(nums: IntArray): Int {
    var ans = 0

    for (i in nums.indices) {
        val evenSet = mutableSetOf<Int>()
        val oddSet = mutableSetOf<Int>()

        for (j in i until nums.size) {

            if (nums[j] % 2 == 0) evenSet.add(nums[j]) else oddSet.add(nums[j])

            // Check if both sets have the same size
            if (evenSet.size == oddSet.size) {
                ans = maxOf(ans, j - i + 1)
            }
        }
    }

    return ans
}