package com.example.kotlincodechallenges.axon

fun main() {
    val exp = "a+b+c"
    val valuesMap = mapOf('a' to "1", 'b' to "a+c", 'c' to "4")

    val newExp = substituteValues(exp, valuesMap)
    println(evaluate(newExp))
}

fun substituteValues(exp: String, valuesMap: Map<Char, String>): String{

    var newString = ""
    exp.forEach{
        if(valuesMap.containsKey(it)){
            val value = valuesMap.get(it)
            try{
                newString+= value!!.toInt()
            }

            catch(e: NumberFormatException){
                newString+= substituteValues(value!!, valuesMap)
            }
        }

        else{
            newString+=it
        }
    }

    return newString
}

fun evaluate(exp: String): Int{

    var length = exp.length
    for(i in 1 until exp.length){
        if("+-".contains(exp[i])){
            val left = exp.substring(0,i)
            val right = exp.substring(i+1)
            val op = exp[i]

            if(op=='+')
                return (evaluate(left) + evaluate(right))
            if(op=='-')
                return (evaluate(left) - evaluate(right))
        }
    }


    return exp.toInt()
}