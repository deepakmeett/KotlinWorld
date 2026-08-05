package com.example.lib.android_related

//Input: nums = [1,5,4,2,9,9,9], k = 3
//Output: 15
//Explanation: The subarrays of nums with length 3 are:
//- [1,5,4] which meets the requirements and has a sum of 10.
//- [5,4,2] which meets the requirements and has a sum of 11.
//- [4,2,9] which meets the requirements and has a sum of 15.
//- [2,9,9] which does not meet the requirements because the element 9 is repeated.
//- [9,9,9] which does not meet the requirements because the element 9 is repeated.
//We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions

fun main() {
    val nums = intArrayOf(1,5,4,2,9,9,9)
    val k = 3
    print(maximumSumOfDistinctSubarraysWithLengthK(nums, k))
}

fun maximumSumOfDistinctSubarraysWithLengthK(nums: IntArray, k: Int): Long {
    var res = 0L

    var j = 0
    var i = 0

    var sum = 0L
    val set = mutableSetOf<Int>()

    while (j < nums.size){
        while (set.contains(nums[j])){
            sum -= nums[i]
            set.remove(nums[i])
            i++
        }

        sum += nums[j]
        set.add(nums[j])

        if(j - i + 1 ==  k){
            res = maxOf(res, sum)
            sum -= nums[i]
            set.remove(nums[i])
            i++
        }

        j++
    }
    return res
}
