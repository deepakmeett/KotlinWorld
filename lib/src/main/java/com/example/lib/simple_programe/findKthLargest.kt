package com.example.lib.simple_programe

fun main() {
    val list = listOf(3, 2, 1, 5, 6, 4)
    val k = 2
    println(findKthLargest(list, k))
}
fun findKthLargest(nums: List<Int>, k: Int): Int {
    return nums.sortedDescending()[k - 1]
}

//fun findKthLargest(nums: List<Int>, k: Int): Int {
//    return nums.sorted().takeLast(k).first()
//}