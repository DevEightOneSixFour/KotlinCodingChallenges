package com.example.kotlincodechallenges.wellsfargo

fun main() {
    val ar1: MutableList<Int> = ArrayList()
    ar1.add(2)
    ar1.add(6)
    val ar2: MutableList<Int> = ArrayList()
    ar2.add(24)
    ar2.add(36)
    val btsj = BetweenTwoSetsJava()
    println(btsj.getTotalX(ar1, ar2))
}
//internal class BetweenTwoSetsJava {
//    fun getGCD(n1: Int, n2: Int): Int {
//        return if (n2 == 0) {
//            n1
//        } else getGCD(n2, n1 % n2)
//    }
//
//    fun getLCM(n1: Int, n2: Int): Int {
//        return if (n1 == 0 || n2 == 0) 0 else {
//            val gcd = getGCD(n1, n2)
//            Math.abs(n1 * n2) / gcd
//        }
//    }
//
//    fun getTotalX(a: List<Int>, b: List<Int>): Int {
//        var result = 0
//
//        // Get LCM of all elements of a
//        var lcm = a[0]
//        for (integer in a) {
//            lcm = getLCM(lcm, integer)
//        }
//
//        // Get GCD of all elements of b
//        var gcd = b[0]
//        for (integer in b) {
//            gcd = getGCD(gcd, integer)
//        }
//
//        // Count multiples of lcm that divide the gcd
//        var multiple = 0
//        while (multiple <= gcd) {
//            multiple += lcm
//            if (gcd % multiple == 0) result++
//        }
//        return result
//    }
//}