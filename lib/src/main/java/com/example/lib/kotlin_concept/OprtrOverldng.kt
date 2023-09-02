package com.example.lib.kotlin_concept

fun main() {

    //region OpOver
    val o1 = OpOver(2, 5)
    val o2 = OpOver(3, 4)
    val o3 = OpOver(6, 7)
    val sum: OpOver = o1 + o2 + o3
    println(sum.x)
    println(sum.y)
    //endregion

}

class OpOver(val x: Int = 0, val y: Int = 10) {
    operator fun plus(p: OpOver): OpOver {
        return OpOver(x + p.x, y + p.y)
    }
}

