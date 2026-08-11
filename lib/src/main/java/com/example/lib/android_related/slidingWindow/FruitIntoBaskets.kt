package com.example.lib.android_related.slidingWindow

//Input: fruits = [1,2,1]
//Output: 3
//Explanation: We can pick from all 3 trees.
// We have condition condition -> k = 2

fun main() {
    val nums = intArrayOf(1, 2, 1)
//    val nums = intArrayOf(0, 1, 2, 2)
//    val nums = intArrayOf(1, 2, 3, 2, 2)
//    val nums = intArrayOf(3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4)
    print(totalFruit(nums))
}

fun totalFruit(fruits: IntArray): Int {
    val k = 2 //Two baskets
    var res = 0
    var left = 0

    val hs = hashMapOf<Int, Int>()

    for (right in fruits.indices) {
        hs[fruits[right]] = hs.getOrDefault(fruits[right], 0) + 1
        while (hs.size > k) {
            hs[fruits[left]] = hs[fruits[left]]!! - 1
            if (hs[fruits[left]] == 0) {
                hs.remove(fruits[left])
            }
            left++
        }
        res = maxOf(res, right - left + 1)
    }
    return res
}
