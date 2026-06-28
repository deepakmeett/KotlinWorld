package com.example.lib.android_related
// Input: s = "  hello world  "
// Output: "world hello"

fun main() {
//    val s = "a good   example"
    val s = "  hello world  "
//    val s = "the sky is blue"
//    val s = " Folo  lC       M3brAFIMt  orQg   hzZ6ZXr4V    HLFPhuKrd   iIlUp465  HsKO       qF     agg      3DTRBSW    W5nI8f   jf8  ipv7nU     W6aRWh  tkTC       D      9cU1SNY     mt5       j      iFMWXsTV   kOgX   2N2p4Lw      RCk6S       d   HTrAP    7      DO       Zej     388Yrfbco  4Qp3   C9E y4LP9Q1t    YD3ZB QZLY    jPLDf      J     YRv   yKrGiI0R    AradFAIg       S44tFijlz iUWOgZlUv       SJ0YwuqU3l     n  9uwSAJFZ kIu    gUsc794d3X   ye Z1pBFk  45LbISTd1T  c riVy     g    J     E37    k0AT     rs   ysgvyG9Cw  wbXLC    EewjgQONX7   z4x7yJ7p      a5P       d       m    6eb8ivfj   L wjZ8km     L6AJFY     utNC  AkcL    2FfQ2k   pt11f  FZXp8mR5X  oe  l0  B wSF Uc"
    print("------->")
    print(
        reverseWord(s)
    )
    print("<-------")
}

fun reverseWord(t: String): String {
    //region Two Pointer approach
    val sb = StringBuilder()
    var right = t.length - 1

    while (right >= 0) {
        while (right >= 0 && t[right] == ' ') right--

        if (right < 0) break

        var left = right
        while (left >= 0 && t[left] != ' ') left--

        sb.append(t, left + 1, right + 1)
        sb.append(" ")

        right = left
    }

    return sb.toString().trim()
    //endregion

    //region Brute Force approach
//    val arr = mutableListOf<String>()
//    var s = ""
//    for (i in t.indices) {
//        if (t[i] == ' ') {
//            if (s != "") {
//                arr.add(s)
//                s = ""
//            }
//        } else {
//            s += t[i]
//        }
//    }
//
//    if (s != "" && s != " ") {
//        arr.add(s)
//    }
//
//    s = ""
//    for (i in arr.size - 1 downTo 0) {
//        s += arr[i]
//        if (i != 0) s += " "
//    }
//    return s
    //endregion
}