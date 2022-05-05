package com.example.kotlincodechallenges.uber

import java.util.*


class TreeNode(var value: Int = 0, var left: TreeNode? = null, var right: TreeNode? = null)

fun widthOfBinaryTree(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }
    var maxWidth = 1
    var queue = ArrayDeque<Pair<TreeNode?, Int>>()
    var tempQueue = ArrayDeque<Pair<TreeNode?, Int>>()
    queue.add(Pair(root, 1))

    while (queue.size > 0) {
        val poppedItem = queue.removeFirst()
        if (poppedItem.first?.left != null) {
            val left = Pair(poppedItem.first!!.left, poppedItem.second * 2)
            tempQueue.add(left)
        }
        if (poppedItem.first?.right != null) {
            val right = Pair(poppedItem.first?.right, poppedItem.second * 2 + 1)
            tempQueue.add(right)
        }

        if (queue.size == 0 && tempQueue.size > 0) {
            maxWidth = maxOf(maxWidth, tempQueue.last().second - tempQueue.first().second + 1)
            queue = tempQueue
            tempQueue = ArrayDeque()
        }
    }

    return maxWidth
}

fun widthOfBinaryTree2(root: TreeNode?): Int {
    if(root == null) return 0

    var maxWidth = 0
    val queue = ArrayDeque<Pair<TreeNode, Int>>()
    queue.add(root to 1)

    while(queue.isNotEmpty()){
        var begin = 0
        var end = 0
        var len = queue.size
        for(i in 0 until len){
            val current = queue.removeFirst()
            if(i == 0) begin = current.second
            if(i == len - 1) end = current.second
            current.first.left?.let {
                queue.add(it to current.second * 2)
            }
            current.first.right?.let {
                queue.add(it to current.second * 2 + 1)
            }
        }

        val width = end - begin + 1
        maxWidth = maxOf(maxWidth, width)
    }

    return maxWidth
}

fun widthOfBinaryTreeJava(root: TreeNode): Int {
    val queue: Deque<TreeNode?> = ArrayDeque()
    root.value = 0
    queue.add(root)
    return bfs(queue)
}

fun bfs(queue: Deque<TreeNode?>): Int {
    var maxWidth = 1
    while (!queue.isEmpty()) {
        val s: Int = queue.size
        val left: Int = queue.peek()?.value!!
        var right = left
        for (i in 0 until s) {
            val node: TreeNode = queue.removeFirst()!!
            if (node.left != null) {
                node.left!!.value = node.value * 2 - 1
                queue.add(node.left)
            }
            if (node.right != null) {
                node.right!!.value = node.value * 2
                queue.add(node.right)
            }
            if (i == s - 1) right = node.value
        }
        maxWidth = Math.max(maxWidth, right - left + 1)
    }
    return maxWidth
}

var maxWidth = 1

fun widthOfBinaryTreeJava2(root: TreeNode?): Int {
    if (root == null) return 0
    traverse(root, 1, 0)
    return maxWidth
}

var firstId: ArrayList<Int> = ArrayList() // First ID of each depth level as the start.


fun traverse(root: TreeNode?, id: Int, depth: Int) {
    if (root == null) return
    if (firstId.size == depth) {
        firstId.add(id)
    } else {
        maxWidth = Math.max(maxWidth, id - firstId[depth] + 1) // check the below diagram
    }
    traverse(root.left, id * 2, depth + 1)
    traverse(root.right, id * 2 + 1, depth + 1)
}


fun insertLeveInOrder(array: Array<String?>, i: Int): TreeNode? {
    if (i >= array.count() || array[i] == "NIL") { return null }
    val temp = TreeNode()
    temp.left = insertLeveInOrder(array, 2 * i + 1)
    temp.right = insertLeveInOrder(array, 2 * i + 2)
    return temp
}

fun main() {
    // input 1 =  [1,3,2,5,3,null,9] result -> 4
    val lines1: Array<String?> = arrayOf("1", "3", "2", "5", "3", null, "9")

    // input 2 = [1,3,2,5] result -> 2
    val lines2: Array<String?> = arrayOf("1", "3", "2", "5")

    // input 3 = [1,3,2,5,null,null,9,6,null,7] result -> 7
    val lines3: Array<String?> =
        arrayOf("1", "3", "2", "5", null, null, "9", "6", null, "7")

    val root = insertLeveInOrder(lines2, 0)!!
    val result = widthOfBinaryTreeJava2(root)
    println(result)
}