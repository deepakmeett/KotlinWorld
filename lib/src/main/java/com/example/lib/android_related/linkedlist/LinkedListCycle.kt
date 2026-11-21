package com.example.lib.android_related.linkedlist


fun main() {
    val first = Node(3)
    val second = Node(2)
    val three = Node(0)
    val four = Node(-4)

    first.next = second
    second.next = three
    three.next = four
    linkedListCycle(first)
}

fun linkedListCycle(head: Node?): Boolean {
    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) {
            return true
        }
    }
    return false
}
