package com.example.lib.android_related.twoPointers

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val nums2 = intArrayOf(2, 5, 6)
    val m = 3
    val n = 3

//    val nums1 = intArrayOf(1)
//    val nums2 = intArrayOf()
//    val m = 1
//    val n = 0

//    val nums1 = intArrayOf(0)
//    val nums2 = intArrayOf(1)
//    val m = 0
//    val n = 1

//    val nums1 = intArrayOf(1)
//    val nums2 = intArrayOf(0)
//    val m = 1
//    val n = 0

    mergeSortedArray(nums1, nums2, m, n)
}

fun mergeSortedArray(nums1: IntArray, nums2: IntArray, m: Int, n: Int) {
    var i = m - 1
    var j = n - 1
    var k = m + n - 1
    while (j >= 0) {
        if (i >= 0 && nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]
            k--
            i--
        } else {
            nums1[k] = nums2[j]
            k--
            j--
        }
    }
    print(nums1.joinToString(""))
}
