package com.example.lib.android_related

fun main() {
    val nums1 = intArrayOf(55, 30, 5, 4, 2)
    val nums2 = intArrayOf(100, 20, 10, 10, 5)

//    val nums1 = intArrayOf(2,2,2)
//    val nums2 = intArrayOf(10,10,1)

//    val nums1 = intArrayOf(30, 29, 19, 5)
//    val nums2 = intArrayOf(25, 25, 25, 25, 25)

    println(maximumDistancePair(nums1, nums2))
}

fun maximumDistancePair(nums1: IntArray, nums2: IntArray): Int {
    var result = 0

    val n1 = nums1.size
    val n2 = nums2.size

    var i = 0
    var j = 0

    while (i < n1 && j < n2) {
        if (nums1[i] <= nums2[j]) {
            result = maxOf(result, j - i)
            j++
        }else{
            i++
        }
    }

    return result
//    for (i in nums1.indices) {
//        for (j in i until nums2.size) {
//            if(nums1[i] <= nums2[j]){
//                result = maxOf(result, j - i)
//            }
//        }
//    }
//    return result
}