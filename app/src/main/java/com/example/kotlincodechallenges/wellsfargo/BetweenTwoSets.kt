package com.example.kotlincodechallenges.wellsfargo
/*
Q2. The program shall be provided with two arrays. arrOne and arrTwo, of type Integer.
    Determine the numbers that lie between the highest number in arrOne and smallest number
    in arrTwo that satisfy the following conditions:
	1.	The number should be a multiple of all elements in arrOne
	2.	The number should be a factor of all elements in arrTwo

Example
arrOne = [4, 8, 2, 6]
arrTwo = [96, 192, 144]

Highest number in arrOne = 8
Smallest number in arrTwo = 96
All potential numbers that can be considered: 9, 10, 11, 12 ……………. 91, 92, 93, 94,95 (exclusive range)
Numbers from the above list that satisfy the conditions (a) and (b): 24, 48
Hence, [24, 48] is the solution to the problem
 */

/*
Test case #1
a = [2,6] b = [24,36]
2 = 2,4,6,8,10...
6 = 6,12,18,24,30...
24 = 2,3,4,6,8,12
36 = 2,3,4,6,9,12,18
b = [24,36]

result : [6,12] == 2

Test case #2
a = [2,4]
b = [16,32,96]

result : [4,8,16] == 3
 */

fun main() {
//    val arrayOne = intArrayOf(4,8,2,6)
//    val arrayTwo = intArrayOf(96,192,144)
//    betweenTwoSets(arrayOne, arrayTwo)

    println("-----GetTotalX tc1")
    val tc1Array1 = intArrayOf(4, 8, 2, 6)
    val tc1Array2 = intArrayOf(96, 192, 144)
    println(getTotalX(tc1Array1,tc1Array2))
    println("From STALGO ${fromSTALGO(tc1Array1,tc1Array2)}")


//    println("")
//    println("-----GetTotalX tc2")
//    val tc2Array1 = intArrayOf(2,4)
//    val tc2Array2 = intArrayOf(16,32,96)
//    println(getTotalX(tc2Array1,tc2Array2))

}

fun getTotalX(a: IntArray, b: IntArray): Int {
    var total = 0
    for (x in 1..100) {
        println("-----Start of loop")
        println("Current x: $x")
        var status = true
        for (element in b) {
            println("-----Start of element in b loop")
            println("Current element: $element")
            if (element % x != 0) {
                println("break $element % $x != 0")
                status = false
                break
            }
        }
        if (status) {
            println("-----Start of element in a loop when status is true")
            for (element in a) {
                println("Current element: $element")
                if (x % element != 0) {
                    println("break $x % $element != 0")
                    status = false
                    break
                }
            }
        }
        if (status) {
            total++
        }
    }
    return total
}

fun fromSTALGO(ar1: IntArray, ar2: IntArray): Int {
    var result = 0

    // Get LCM of all elements of a
    var lcm = ar1[0]
    for (i in ar1) {
        lcm = findLCM(lcm, i)
    }

    // Get GCD of all elements of b
    var gcd = ar2[0]
    for (j in ar2) {
        gcd = findGCD(gcd, j)
    }

    // Count multiples of lcm that divide the gcd
    var multiple = 0
    while (multiple <= gcd) {
        multiple+=lcm

        if (gcd % multiple == 0) {
            println("GCD: $gcd\nMultiple: $multiple")
            result++
        }
    }

    return result
}
fun findLCM(ar1: Int, ar2: Int): Int {

    var lcm = if (ar1 > ar2) ar1 else ar2

    while (true) {
        if (lcm % ar1 == 0 && lcm % ar2 == 0) {
            println("The LCM of $ar1 and $ar2 is $lcm.")
            break
        }
        ++lcm
    }
    return lcm
}

fun findGCD(n1: Int, n2: Int): Int{
    var gcd = 1
    var i = 1
    while (i <= n1 && i <= n2) {
        // Checks if i is factor of both integers
        if (n1 % i == 0 && n2 % i == 0)
            gcd = i
        ++i
    }
    println("G.C.D of $n1 and $n2 is $gcd")
    return gcd
}

/*
public class GCDExample2 {

    public static void main(String[] args) {

        int num1 = 55, num2 = 121;

        while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }

        System.out.printf("GCD of given numbers is: %d", num2);
    }

}
 */