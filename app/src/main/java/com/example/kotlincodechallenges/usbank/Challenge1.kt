package com.example.kotlincodechallenges.usbank

fun main() {
//    val number = 212
//    val shiftedNumber = number shl 1
//
//    println(shiftedNumber.countTrailingZeroBits())
    /*
                 00000000000000000000000000000000
        212   -> 00000000000000000000000011010100
        shl 1 -> 00000000000000000000000110101000
        shr 1 -> 00000000000000000000000001101010

     */

//    val input = arrayOf(-1,-3,10,0,60)
    val input = intArrayOf(-1,-3, 10, 0, 60)

    println(maxProduct(input))
}

//fun maxProduct(intArray: Array<Int>): Int{
//    if (intArray.isEmpty()){
//        return -1
//    }
//    var maxValue = Integer.MIN_VALUE
//    for (i in 0..intArray.size) {
//        for (j in 1..intArray.size) {
//            var temp = 1
//            for(k in k <)
//        }
//
//    }
//}

fun maxProduct(a: IntArray): Int {
    val n = a.size
    if (n == 0) {
        return -1
    }
    var minProd = a[0]
    var maxProd = a[0]
    var answer = a[0]
    var choice1: Int
    var choice2: Int
    for (i in 1 until n) {
        choice1 = minProd * a[i]
        choice2 = maxProd * a[i]
        minProd = a[i].coerceAtMost(choice1.coerceAtMost(choice2))
        maxProd = a[i].coerceAtLeast(choice1.coerceAtLeast(choice2))
        answer = answer.coerceAtLeast(maxProd)
    }
    return answer
}

/*
Brute Force
class Playground {
    public static void main(String[ ] args) {
        int[] input = new int[]{-1,-3,10,0,60};

        System.out.println(maxProduct(input));
    }
    public static int maxProduct(int[] A) {
        if (A.length == 0) {
            return -1;
        }

        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<A.length;i++) {
            for(int j=i;j<A.length;j++){
                int temp=1;
                for(int k=i; k<= j; k++){
                    temp *= A[k];
                }
                if(temp>maxValue) {
                    maxValue = temp;
                }
            }
        }
        return maxValue;
    }
}
 */

/*
Tracking max prod and min prod
class Playground {
    public static void main(String[ ] args) {
        int[] input = new int[]{-1,-3,10,0,60};

        System.out.println(maxProduct(input));
    }
    public static int maxProduct(int[] a) {
        int n = a.length;
        if(n==0){
            return -1;
        }

        int minProd = a[0];
        int maxProd = a[0];
        int answer = a[0];

        int choice1, choice2;
        for(int i=1; i<n; i++) {
            choice1= minProd * a[i];
            choice2= maxProd * a[i];
            minProd = Math.min(a[i], Math.min(choice1, choice2));
            maxProd = Math.max(a[i], Math.max(choice1, choice2));
            answer = Math.max(answer, maxProd);
        }

        return answer;
    }
}
 */