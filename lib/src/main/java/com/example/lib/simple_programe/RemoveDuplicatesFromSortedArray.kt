package com.example.lib.simple_programe

fun main() {
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 5)
//    val nums = intArrayOf(1, 1, 2)
    println(
        removeDuplicate(nums)
    )
}

fun removeDuplicate(nums: IntArray): Int {
    var res = 0
    for (i in 0 until nums.size) {
        if (i < nums.size - 1 && nums[i] == nums[i + 1]) {
            continue
        } else {
            nums[res] = nums[i]
            res++
        }
    }
    println(nums.joinToString())
    return res
}