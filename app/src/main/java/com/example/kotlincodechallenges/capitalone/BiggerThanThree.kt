package com.example.kotlincodechallenges.capitalone

/* To execute Kotlin code, please define a top level function named main
 1. Declare an array with the values:  Amy, Michael, Bob, Alice, William.

  2 Write a function that can accept that array as a parameter.
   The function should find all the values in the array that have more than 3 characters. Then it should print out the total character count of all of those values.
   Example: For the array with the values in Question 1, the total should equal 19. Michael + Alice + William = 19 characters total.

  3. add null to the array and change the function accordingly.
*/

fun main() {
    val names = arrayOf("Amy", "Michael", "Bob", "Alice", "William", null)
    biggerThanThree(names)
    testBiggerThanThree()
}

fun biggerThanThree(names: Array<String?>): Int {
    var result = 0

    for (s in names) {
        if(s == null) {
            continue
        } else if(s.length > 3) {
            result += s.length
        }
    }

    println("Length is $result")
    return result
}

// Pregunta de codigo
//internal inline fun <reified T> String.toDataClass(): T {
//    val userTypeToken = object: TypeToken<T>() {}.type
//    return Gson.fromJson(this, userTypeToken)
//}

fun testBiggerThanThree() {
    val testArray1 = arrayOf("Amy", "Michael", "Bob", "Alice", "William", null)
    val nullArray = arrayOf<String?>(null, null)
    val shortArray = arrayOf<String?>("Amy","Jay")

    println(biggerThanThree(testArray1) == 19)
    println((biggerThanThree(nullArray)) == 0)
    println((biggerThanThree(shortArray)) == 0)

}