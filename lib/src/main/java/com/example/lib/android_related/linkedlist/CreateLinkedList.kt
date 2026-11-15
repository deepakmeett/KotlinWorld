package com.example.lib.android_related.linkedlist


fun main() {
    val first = Node(10)
    val second = Node(20)
    val three = Node(30)

    first.next = second
    second.next = three
    printAllValues(first)
}
fun printAllValues(head: Node?) {
    var curr: Node? = head
    while (curr != null) {
        print("${curr.data} ")
        curr = curr.next
    }
}
