package com.example.kotlincodechallenges.wellsfargo

fun main() {
    val given = 8
    val numbers = intArrayOf(1,2,3,4,6,7,8,9,10)
    println(closestToGivenNumber(given, numbers))
}
// todo refactor
fun closestToGivenNumber(given: Int, array: IntArray): String {
    for (i in array) {
        var j = i+1
        var k = given

        var sum = i + j + k

        while (k >= j) {
            println("------Start of While")
            println("Current i: $i")
            println("Current j: $j")
            println("Current k: $k")
            println("Current sum: $sum")

            if (sum == given
                && i != j && i !=k && j != k
            )
                return "$i + $j + $k = $sum"

            if (sum > given) k-- else j++

            sum = i + j + k
            println("------End of While")
            println("Current i: $i")
            println("Current j: $j")
            println("Current k: $k")
            println("Current sum: $sum")
        }
    }
    return "No sum found"
}

class Construction constructor(val s: String) {

    init {
        println("Primary Constructor")
    }


}