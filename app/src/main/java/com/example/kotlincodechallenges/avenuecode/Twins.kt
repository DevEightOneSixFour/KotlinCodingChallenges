package com.example.kotlincodechallenges.avenuecode

import java.util.*

// Todo: does not work
fun main() {
    val a = arrayOf("asda","werq","baca")
    val b = arrayOf("asda","werq","bacq")

    println(twins(a,b))
}
fun twins(a: Array<String>, b: Array<String>): String {
    val result = BooleanArray(a.size)
    for (i in a.indices) {
        val aVal = a[i].lowercase(Locale.getDefault())
        val bVal = b[i].lowercase(Locale.getDefault())
        val aValArray = aVal.split("").toTypedArray()
        val bValArray = bVal.split("").toTypedArray()
        for (s in aValArray) {
            for (index in aValArray.indices) {
                if (bValArray[index] == s) { // checking whether the index match or not
                    if (s.indexOf(s) % 2 == 0 && index % 2 == 0 ||  // checking even values
                        s.indexOf(s) % 2 != 0 && index % 2 != 0
                    ) {
                        result[i] = false
                    } else if (s.indexOf(s) % 2 == 0 && index % 2 != 0
                        || s.indexOf(s) % 2 != 0 && index % 2 == 0
                    ) {
                        result[i] = true
                        break
                    }
                }
            }
        }
    }
    return result.joinToString("|")
}

/*
fun twins(a: Array<String>, b: Array<String>): Array<String> {
        val result = BooleanArray(a.size)
        for (i in a.indices) {
            val aVal = a[i].toLowerCase()
            val bVal = b[i].toLowerCase()
            val aValArray = aVal.split("").toTypedArray()
            val bValArray = bVal.split("").toTypedArray()
            for (s in aValArray) {
                for (index in aValArray.indices) {
                    if (bValArray[index] == s) { // checking whether the index match or not
                        if (s.indexOf(s) % 2 == 0 && index % 2 == 0 ||  // checking even values
                            s.indexOf(s) % 2 != 0 && index % 2 != 0
                        ) {
                            result[i] = false
                        } else if (s.indexOf(s) % 2 == 0 && index % 2 != 0
                            || s.indexOf(s) % 2 != 0 && index % 2 == 0
                        ) {
                            result[i] = true
                            break
                        }
                    }
                }
            }
        }
        return result
    }
 */