package com.example.lib.android_related.stack

import kotlin.math.absoluteValue

//Input: asteroids = [5,10,-5]
//Output: [5,10]
//Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

fun main() {
    val asteroids = intArrayOf(5, 10, -5)
//    val asteroids = intArrayOf(8, -8)
//    val asteroids = intArrayOf(10, 2, -5)
//    val asteroids = intArrayOf(3, 5, -6, 2, -1, 4)
//    val asteroids = intArrayOf(4, -10)
    println(asteroidCollision(asteroids).contentToString())
}

fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = ArrayDeque<Int>()

    for (i in asteroids) {
        var add = true
        while (add && stack.isNotEmpty() && stack.last() > 0 && i < 0) {
            when {
                stack.last() < i.absoluteValue -> {
                    stack.removeLast()
                }

                stack.last() == i.absoluteValue -> {
                    stack.removeLast()
                    add = false
                }

                else -> {
                    add = false
                }
            }
        }
        if (add) {
            stack.addLast(i)
        }
    }

    return stack.toIntArray()
}
