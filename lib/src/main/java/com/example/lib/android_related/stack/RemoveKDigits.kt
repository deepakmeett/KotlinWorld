package com.example.lib.android_related.stack

//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.

fun main() {
    val testCases = listOf(
        ("1432219" to 3) to "1219",
        ("10200" to 1) to "200",
        ("10" to 2) to "0",
        ("10" to 1) to "0",
        ("112" to 1) to "11",
        ("33526221184202197273" to 19) to "0",
        ("10001" to 4) to "0"
    )

    for ((input, expected) in testCases) {
        val (num, k) = input
        val actual = removeKdigits(num, k)
        println("removeKdigits(\"$num\", $k) = \"$actual\" (Expected: \"$expected\") -> ${if (actual == expected) "PASS" else "FAIL"}")
    }
}

fun removeKdigits(num: String, k: Int): String {
    if (num.length == k) return "0"

    var remainK = k
    val stack = ArrayDeque<Char>()

    for (digit in num) {
        while (remainK > 0 && stack.isNotEmpty() && stack.last() > digit) {
            stack.removeLast()
            remainK--
        }
        stack.addLast(digit)
    }

    // Remove remaining k digits from the end if necessary
    while (remainK > 0 && stack.isNotEmpty()) {
        stack.removeLast()
        remainK--
    }

    // Build result and strip leading zeros
    val sb = StringBuilder()
    var leadingZero = true
    for (digit in stack) {
        if (leadingZero && digit == '0') {
            continue
        }
        leadingZero = false
        sb.append(digit)
    }

    return if (sb.isEmpty()) "0" else sb.toString()
}
