package com.example.lib.android_related.hashMapHashSet

fun main() {
    val myArray = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(myArray, target)
    println(result.toList())
}

fun twoSum(arr: IntArray, target: Int): IntArray{
    val map = mutableMapOf<Int, Int>()
    for(i in arr.indices){
        val current = target - arr[i]
        if(map.containsKey(current)){
            return intArrayOf(map[current]!!, i)
        }
        map[arr[i]] = i
    }
    return intArrayOf(-1, -1)
}
