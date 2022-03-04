package com.example.kotlincodechallenges.capitalone

// find the sum of number strings
fun main() {
    print(findSum("26","47"))

}
fun findSum(num1: String?, num2: String?): String{

    var n1 = num1?:"0"
    var n2 = num2?:"0"

    //checking if n2 is longer, else swap the string s to make it such
    if(n1.length>n2.length){
        n1 = n2.also{ n2 = n1}
    }

    //getting length of both strings
    val length1 = n1.length
    val length2 = n2.length

    //empty string to store the result
    var result = ""

    //reversing both strings
    n1 = n1.reversed()
    n2 = n2.reversed()

    var carry = 0

    for(i in 0 until length1){

        /*computing sum of digits in same position in both strings and the carry*/

        val sum = (Character.getNumericValue(n1[i]) + Character.getNumericValue(n2[i]) + carry)

        result += sum%10

        //calculating carry for next step
        carry = sum/10
    }


    //adding remaining digits of the larger number
    for(i in length1 until length2){
        val sum = (Character.getNumericValue(n2[i]) + carry)
        result += sum%10

        carry = sum/10
    }


    //adding the remaining carry
    if(carry>0){
        result+= carry
    }

    //reversing the string again to get the result
    result = result.reversed()

    return result

}
