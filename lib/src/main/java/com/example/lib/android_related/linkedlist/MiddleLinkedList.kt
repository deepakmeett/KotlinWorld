package com.example.lib.android_related.linkedlist

fun main() {
    val first = Node(1)
    val second = Node(2)
    val third = Node(3)
    val fourth = Node(4)
    val fifth = Node(5)
    val sixth = Node(6)

    first.next = second
    second.next = third
    third.next = fourth
    fourth.next = fifth
    fifth.next = sixth

    println("Original list:")
    printAllValues(first)
    println()

    val middleNode = middleLinkedList(first)

    println("Middle of the linked list:")
    printAllValues(middleNode)
}

//fun middleLinkedList(head: Node?): Node? {
//    val middleIndex = getSize(head) / 2
//    var current = head
//    var i = 0
//    while (i < middleIndex) {
//        current = current?.next
//        i++
//    }
//    return current
//}
fun middleLinkedList(head: Node?): Node? {
    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}
