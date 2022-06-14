package com.example.kotlincodechallenges.samsung

/*
Given two Nodes as parameters to method, fin the lowest common ancestor
eg.
            A
        B       C
      D   E   F    G
Assume a Node class that has parent and a String value for node name.

Given F and G, output C
Given D and F, output A
 */

data class Node(var value: String) {
    var parent: Node? = null
}

fun findCommonAncestor(one: Node, two: Node): String {

    // return Lowest Common Ancestor
    return "one${one.value} two:${two.value}"
}

fun main() {
    val a = Node("A")
    val b = Node("B")
    val c = Node("C")
    val d = Node("D")
    val e = Node("E")
    val f = Node("F")
    val g = Node("G")

    b.parent = a
    c.parent = a
    d.parent = b
    e.parent = b
    f.parent = c
    g.parent = c
}