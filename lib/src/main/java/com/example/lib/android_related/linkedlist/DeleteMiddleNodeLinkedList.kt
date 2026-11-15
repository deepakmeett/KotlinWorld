package com.example.lib.android_related.linkedlist

fun main() {
    val first = Node(1)
    val second = Node(3)
    val third = Node(4)
    val fourth = Node(7)
    val fifth = Node(1)
    val sixth = Node(2)
    val seventh = Node(6)

    first.next = second
    second.next = third
    third.next = fourth
    fourth.next = fifth
    fifth.next = sixth
    sixth.next = seventh

    println("Original list:")
    printAllValues(first)
    println()

    deleteMiddleNode(first)

    println("List after deleting middle node")
    printAllValues(first)
}

fun deleteMiddleNode(node: Node?): Node? {

    if (node?.next == null) return null

    val size = getSize(node)
    val middleIndex = size / 2

    var current = node

    // Move to the node before the middle node
    repeat(middleIndex - 1) {
        current = current?.next
    }

//    // Move to the node before the middle node: Same work as above 'repeat' keyword line
//    var i = 0
//    while (i < middleIndex - 1) {
//        current = current?.next
//        i++
//    }

    // Skip the middle node
    current?.next = current?.next?.next

    return node
}

fun getSize(head: Node?): Int {
    var current = head
    var count = 0

    while (current != null) {
        count++
        current = current.next
    }

    return count
}