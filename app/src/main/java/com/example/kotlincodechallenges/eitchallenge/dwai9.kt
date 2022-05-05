package com.example.kotlincodechallenges.eitchallenge

// fail
class EnhanceIt {
    fun isUnique(str: String) {
        val map = hashMapOf<Char, Int>()
        str.forEach {
            if (map[it] == null)
                map[it] = 1
            else
                map[it] = map[it]?.plus(1) ?: 2
        }
        map.forEach {
            if (it.value == 1) {
                print("true")
                return@forEach
            }
            else {
                print("false")
                return@forEach
            }
        }
    }
}

fun main(args: Array<String>) {
    val obj = EnhanceIt()
    obj.isUnique(ALPHABET)
    obj.isUnique(NONPHABET)
}
