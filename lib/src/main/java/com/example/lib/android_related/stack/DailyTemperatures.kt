package com.example.lib.android_related.stack

//Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]

fun main() {
    val temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73)
    println(dailyTemperatures(temperatures).contentToString())
}

fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size)
    val stack = ArrayDeque<Int>() // Monotonic stack storing indices

    for (i in temperatures.indices) {
        while (stack.isNotEmpty() && temperatures[stack.last()] < temperatures[i]) {
            val prevIndex = stack.removeLast()
            result[prevIndex] = i - prevIndex
        }
        stack.addLast(i)
    }

    return result
}