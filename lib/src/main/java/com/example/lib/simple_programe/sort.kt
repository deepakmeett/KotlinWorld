package com.example.lib.simple_programe

import java.util.Arrays



fun main() {
    var s = "deepak"

    // Convert the string to a character array
    val arr = s.toCharArray().sorted().joinToString("")

    // Sort the character array
//    Arrays.sort(arr)

    // Convert sorted character array back to string
//    s = String(arr)

    // Print the sorted string
    print(arr)
}