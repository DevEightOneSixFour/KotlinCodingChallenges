package com.example.kotlincodechallenges.axon

//examples:
// expression: a            vars = [a=3]              solution=3
// expression: a+b+c        vars = [a=3,b=2,c=4]      solution=9
// expression: a+b-c+d+5    vars = [a=3,b=2,c=-7,d=4] solution=21
// expression: a+b-c+d+175  vars = [a=-3,b=-5,c=-7,d=4] solution=178
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val eval = ArithEvaluation()

    val input1 = "3"
    val input2 = "3+2+4"
    val input3 = "3+2-7+4+5"
    val input4 = "3-5-7+4+175"

    println("The result of $input1 is: " + eval.performEval(input1))
    println("The result of $input2 is: " + eval.performEval(input2))
    println("The result of $input3 is: " + eval.performEval(input3))
    println("The result of $input4 is: " + eval.performEval(input4))
}

class ArithEvaluation {
    fun performEval(expression: String?): Int {
        if (expression == null || expression.isEmpty()) {
            return 0
        }

        // for math operations and ()
        val tokenizer = StringTokenizer(expression, "+-*/()", true)
        val stack = Stack<String>()
        val list: MutableList<String> = ArrayList()

        // goes through the string until the end
        while (tokenizer.hasMoreTokens()) {
            // eliminates empty space
            var token = tokenizer.nextToken().trim { it <= ' '}

            if (token.isEmpty()) {
                continue
            } else if(token == "(") {
                // add current token to stack
                stack.push(token)
            } else if (token == ")") {
                var bracket: String
                while (stack.pop().also { bracket = it} != "(") {
                    list.add(bracket)
                }
            } else if ("+-*/".contains(token)) {
                while (!stack.isEmpty() &&
                    (stack.peek() == "*" ||
                            stack.peek() == "/")) {
                    list.add(stack.pop())
                }
                stack.push(token)
            } else {
                list.add(token)
            }
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop())
        }
        return calculate(list)
    }

    private fun calculate(tokens: List<String>): Int {
        var stack = Stack<Int>()
        for (token in tokens) {
            if ("+-*/".contains(token!!)) {
                val n2: Int = stack.pop()
                val n1: Int = stack.pop()
                var result = 0

//                if (token.equals("+")) {
//                    result = n1 + n2
//                } else if (token.equals("-")) {
//                    result = n1 - n2
//                } else if (token.equals("*")) {
//                    result = n1 * n2
//                } else if (token.equals("/")) {
//                    result = n1 / n2
//                }
                when(token) {
                    "+" -> result = n1 + n2
                    "-" -> result = n1 - n2
                    "*" -> result = n1 * n2
                    "/" -> result = n1 / n2
                }
                stack.push(result)
            } else {
                stack.push(token.toInt())
            }
        }
        return stack.pop()
    }
}
