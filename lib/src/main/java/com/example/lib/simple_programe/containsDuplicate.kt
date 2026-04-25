package com.example.lib.simple_programe

fun main() {
    val nums = intArrayOf(1,2,3,1)
    println(containsDuplicate(nums))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (i in nums) {
        if (set.contains(i)) return true
        set.add(i)
    }
    return false
}
