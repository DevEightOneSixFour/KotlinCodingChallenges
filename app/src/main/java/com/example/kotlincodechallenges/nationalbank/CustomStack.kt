package com.example.kotlincodechallenges.nationalbank

import java.util.Stack

fun main() {
    minStackDriver()
}

fun minStackDriver(){
    val stack = MinStack()
    stack.push(-2)
    stack.push(0)
    stack.push(-3)
    println("top: ${stack.top()}")
    println("getMin: ${stack.getMin()}")
    stack.pop()
    println("top: ${stack.top()}")
    println("getMin: ${stack.getMin()}")
    println(stack.printMinStack())
}
class CustomMinStack{
    private val col = mutableListOf<Int>()
    private val colOrdered = mutableListOf<Int>()
    private val lastIndex: Int
        get() = col.size - 1

    /**
     * From my understanding, only getMin should be constant time.
     * Pushing an element and reorder by minVal
     *
     */
    fun push(element: Int){
        colOrdered.clear()
        col.add(element)
        colOrdered.addAll(col)
        colOrdered.sortDescending()
    }

    fun pop(){
        colOrdered.clear()
        col.removeAt(lastIndex)
        colOrdered.addAll(col)
    }

    fun top(): Int{
        return col[lastIndex]
    }

    fun getMin(): Int{
        return colOrdered[0]
    }
}

//internal class MinStack {
//    var st = Stack<Long>()
//    var mini: Long
//    fun push(value: Int) {
//        val `val` = java.lang.Long.valueOf(value.toLong())
//        if (st.isEmpty()) {
//            mini = `val`
//            st.push(`val`)
//        } else {
//            if (`val` < mini) {
//                st.push(2 * `val` - mini)
//                mini = `val`
//            } else {
//                st.push(`val`)
//            }
//        }
//    }
//
//    fun pop() {
//        if (st.isEmpty()) return
//        val `val` = st.pop()
//        if (`val` < mini) {
//            mini = 2 * mini - `val`
//        }
//    }
//
//    fun top(): Int {
//        val `val` = st.peek()
//        return if (`val` < mini) {
//            mini.toInt()
//        } else `val`.toInt()
//    }
//
//    val min: Int
//        get() = mini.toInt()
//
//    /** initialize your data structure here.  */
//    init {
//        mini = Long.MAX_VALUE
//    }
//}

class OtherStack() {

    // create our "stack"
    private val stack = mutableListOf<Int>()
    // create variable for the "top" of our top
    private val lastIndex: Int
        get() = stack.size - 1

    // push element into stack
    fun push(element: Int) = stack.add(element)

    // pop last index
    fun pop() {
        stack.removeAt(lastIndex)
    }

    // get top element
    fun top() = stack[lastIndex]

    // get min element
    fun getMin(): Int = stack.minOrNull()!!

    fun printStack() = stack.joinToString()
}

class MinStack {
    // our "stack"
    private val minStack = mutableListOf<Int>()

    // add to the minStack
    fun push(num: Int) = minStack.add(num)

    // remove last element of minStack
    fun pop() {
        if(minStack.isNotEmpty()) minStack.removeAt(minStack.size - 1)
    }

    // return element on top of the minStack
    fun top() =
        if (minStack.isNotEmpty())  {
            minStack[minStack.size - 1]
        } else {
            0
        }

    // return minimum element of stack
    fun getMin() = minStack.minOrNull()

    // print stack for testing purposes
    fun printMinStack() = minStack.joinToString(" | ")
}

class AnotherMinStack2<T> {
    private val minStack = mutableListOf<T>()
    private val orderedMinStack = mutableListOf<T>()

    // add to the minStack
    fun push(value: T) = minStack.add(value)

    // remove last element of minStack
    fun pop() {
        minStack.removeAt(minStack.size - 1)
    }

    // return element on top of the minStack
    fun top() = minStack[minStack.size - 1]

    // return minimum element of stack


    // print stack for testing purposes
    fun printMinStack() = minStack.joinToString(" | ")
}
