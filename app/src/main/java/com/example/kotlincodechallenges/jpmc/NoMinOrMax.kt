package com.example.kotlincodechallenges.jpmc

fun main() {

    val array = intArrayOf(1,2,3,4,5)
    noMinOrMax(array)
}

fun noMinOrMax(array: IntArray) {
    var mini = array[0]
    var max = 0
    var list = mutableListOf<Int>()


    for (i in array) {
        list.add(i)
        when {
            i < mini -> mini = i

            i > max -> max = i
        }
    }
    list.run {
        remove(mini)
        remove(max)
    }
    println(list.joinToString(","))
}
