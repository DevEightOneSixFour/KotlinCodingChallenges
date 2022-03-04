package com.example.kotlincodechallenges.wellsfargo


/*
 A Happy Number n is defined by the following process.
 Starting with n, replace it with the sum of the squares of its digits,
 and repeat the process until n equals 1, or it loops endlessly in a cycle
 which does not include 1.
 Those numbers for which this process ends in 1 are Happy Numbers,
 while those that do not end in 1 are unhappy numbers.
First few happy numbers are
1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68,
70, 79, 82, 86, 91, 94, 97, 100

Examples:
Input :  23
Output : Yes
Explanation :
First Iteration:
22 + 32 = 4 + 9 = 13
Second Iteration:
12 + 32 = 1 + 9 = 10
Third Iteration:
12 + 02 = 1 + 0 = 1
Since we reach 1, 23 is Happy.
 */
fun main() {

    if(isHappy(23)) {
        print("Yes")
    } else {
        print("No")
    }
}

// Returns sum of squares of digits
// of a number n. For example for n = 12
// it returns 1 + 4 = 5
fun sumDigitSquare(num: Int): Int {
    var temp = num
    var sq = 0
    while (temp > 0) {
        val digit = temp % 10
        sq += digit * digit
        temp /= 10
    }
    return sq
}


fun isHappy(num: Int): Boolean{
    var temp = num
    // A set to store numbers during
    // repeated square sum process
    val hashSet = hashSetOf<Int>()
    hashSet.add(temp)

    // Keep replacing n with sum of
    // squares of digits until we either
    // reach 1 or we end up in a cycle


    while (true) {

        // Number is Happy if we reach 1
        if (temp == 1 ) return true

        // Replace n with sum of squares of digits
        temp = sumDigitSquare(temp)

        // If n is already visited, a cycle is form
        // so not Happy
        if (hashSet.contains(temp)) return false

        hashSet.add(temp)
    }
}