package com.example.lib.android_related.linkedlist

fun main() {
    val first = Node(4)
    val second = Node(5)
    val third = Node(1)
    val fourth = Node(9)

    first.next = second
    second.next = third
    third.next = fourth

    println("Original list:")
    printAllValues(first)
    println()

    // Delete node 'second' (value 20)
    deleteNode(third)

    println("List after deleting node with value 20:")
    printAllValues(first)
}

fun deleteNode(node: Node?) {
    val nextNode = node?.next ?: return
    node.data = nextNode.data
    node.next = nextNode.next
}
