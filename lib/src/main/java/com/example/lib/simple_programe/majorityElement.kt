package com.example.lib.simple_programe

fun main() {
    val nums = intArrayOf(3, 2, 3)
    println(majorityElement(nums))
}

fun majorityElement(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    for (i in nums) {
        map[i] = map.getOrDefault(i, 0) + 1
    }
    return map.maxByOrNull { it.value }!!.key
}
