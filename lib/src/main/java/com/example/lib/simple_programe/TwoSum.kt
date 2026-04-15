package com.example.lib.simple_programe

fun main() {
    val myArray = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(myArray, target)
    println(result.toList())
}

//fun twoSum(myArray: IntArray, target: Int): IntArray {
//    for (i in myArray.indices) {
//        for (j in i + 1 until myArray.size) {
//            if (myArray[i] + myArray[j] == target) {
//                return intArrayOf(i, j)
//            }
//        }
//    }
//    return intArrayOf(-1, -1)
//}
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
