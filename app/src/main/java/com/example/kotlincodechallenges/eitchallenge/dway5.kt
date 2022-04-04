package com.example.kotlincodechallenges.eitchallenge

fun main() {
    checkUnique()
}

fun checkUnique(){
    print("Log ${"abc".checkAll()}")
    print("Log ${"abbc".checkAll()}")
}

fun String.checkAll():Boolean = all(hashSetOf<Char>()::add)
