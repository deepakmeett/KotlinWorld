package com.example.lib.android_related.slidingWindow

fun main() {
//    val answerKey = "TTFF"
//    val k = 2

//    val answerKey = "TFFT"
//    val k = 1

//    val answerKey = "TTFTTFTT"
//    val k = 1

    val answerKey = "FFFTTFTTFT"
    val k = 3

    print(maxConsecutiveAnswers(answerKey, k))
}

fun maxConsecutiveAnswers(answerKey: String, k: Int): Int {
    return maxOf(
        maxConsecutive(answerKey, 'T', k),
        maxConsecutive(answerKey, 'F', k)
    )
}

private fun maxConsecutive(answerKey: String, tOrFChar: Char, k: Int): Int {
    var res = 0
    var count = 0
    var left = 0

    val ak = answerKey.toCharArray()

    for (right in ak.indices) {
        if (ak[right] == tOrFChar) count++

        while (count > k) {
            if (ak[left] == tOrFChar) count--
            left++
        }
        res = maxOf(res, right - left + 1)
    }
    return res
}