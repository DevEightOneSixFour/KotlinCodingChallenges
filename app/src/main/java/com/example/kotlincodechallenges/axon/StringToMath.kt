package com.example.kotlincodechallenges.axon

fun main() {
    val equation = "1+2+3" // 6
    println("String equation = ${parseAndCalculate(equation)}")
    println("String equation from StackOF = ${fromStackOF(equation)}")
}

fun parseAndCalculate(equation: String): Int {
    var result = 0

    var function = 1

    for ((index, char) in equation.withIndex()) {
        when (char) {
            '+' -> function = 1
            '-' -> function = -1
            else -> result += function * char.toString().toInt()
        }
    }


    return result
}

fun fromStackOF(input: String): String {
    var result = 0
    var currentNumString = ""
    var currentSymbol = ' '

    for (i in input) {

        // get the current number
        if (i in '0'..'9') {
            currentNumString += i
        } else {
            currentSymbol = i
        }
        if (currentNumString != "") {
            when (currentSymbol) {
                '+' -> result += Integer.parseInt(currentNumString)
                '-' -> result -= Integer.parseInt(currentNumString)
                '*' -> result *= Integer.parseInt(currentNumString)
                '/' -> result /= Integer.parseInt(currentNumString)
            }
        }
        println("Current result: $result")
        currentNumString = ""
    }



    return result.toString()
}