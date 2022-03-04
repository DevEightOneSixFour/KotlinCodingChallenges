package com.example.kotlincodechallenges.nationalbank

import java.util.*

fun main() {
    println("is Valid: ${isValid("()")}") // true
    println("is Valid: ${isValid("()[]{}")}") // true
    println("is Valid: ${isValid("(}")}") // false
    println("is Valid: ${isValid("([)]")}") // false
    println("is Valid: ${isValid("{[]}")}") // true

    println("-----------")
    println("is Valid: ${anotherValidParentheses("()")}") // true
    println("is Valid: ${anotherValidParentheses("()[]{}")}") // true
    println("is Valid: ${anotherValidParentheses("(}")}") // false
    println("is Valid: ${anotherValidParentheses("([)]")}") // false
    println("is Valid: ${anotherValidParentheses("{[]}")}") // true
}


fun validParentheses(inputString: String): Boolean {
    val newStack = Stack<Char>()

    for (ch in inputString) {

        // push starting brackets
        if (ch == '(' || ch == '[' || ch == '{') {
            newStack.push(ch)
        }

        // return empty if no empty
        if (newStack.isEmpty()) return false

        // check for ending bracket
        val symbolCheck: Char
        when (ch) {
            ')' -> {
                symbolCheck = newStack.pop()
                if (symbolCheck == '{' || symbolCheck == '[')
                    return false
            }

            '}' -> {
                symbolCheck = newStack.pop()
                if (symbolCheck == '(' || symbolCheck == '[')
                    return false
            }

            ']' -> {
                symbolCheck = newStack.pop()
                if (symbolCheck == '(' || symbolCheck == '{')
                    return false
            }
        }
    }

    return newStack.isEmpty()
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for(i in s) {
        if(!stack.isEmpty() && isClosed(i, stack.peek())) {
            stack.pop()
        } else {
            stack.push(i)
        }
    }
    return stack.isEmpty()
}

fun isClosed(symbol: Char, topSymbol: Char): Boolean {
    when (topSymbol) {
        '(' -> return symbol == ')'
        '{' -> return symbol == '}'
        '[' -> return symbol == ']'
    }
    return false
}

fun anotherValidParentheses(value: String): Boolean {
    val symbolStack = Stack<Char>()

    for (c in value) {
        if (c == '{' || c == '(' || c == '[') {
            // start of a block? add it to the stack
            symbolStack.push(c)
        } else {
            // if stack is empty, no starting parentheses exist
            if (symbolStack.empty()) return false

            // check for second half of parentheses
            // if the second half exists but no first half, return false
            when(c) {
                '}' -> {
                    if(symbolStack.peek() == '{') symbolStack.pop()
                    else return false
                }
                ')' -> {
                    if(symbolStack.peek() == '(') symbolStack.pop()
                    else return false
                }
                ']' -> {
                    if(symbolStack.peek() == '[') symbolStack.pop()
                    else return false
                }
            }
        }
    }
    // if stack is empty here, each char was popped from the stack and is valid
    // else stack is not empty and still has missing pairs
    return symbolStack.empty()
}

