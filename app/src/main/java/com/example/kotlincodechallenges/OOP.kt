package com.example.kotlincodechallenges

// Encapsulation
class OOP {
    private var string: String = ""
    private var id: Int = 0

    public fun getString() = string
    public fun setString(s: String) {
        string = s
    }
}

class Otherclass {
    val oop = OOP()

    val newString = oop.getString()

}

// Polymorphism
fun main() {
    printThis(8)
    printThis("8")
    println("-------")

    val sub = Sub()
    sub.doWork()
}
// overloading -> compile time

fun printThis(s: String) {
    println("$s is a String")
}

fun printThis(i: Int) {
    println("$i is an Integer")
}

// overriding -> run time
open class Base() {

    open fun doWork(){
        // work done here
        printThis("From Base")
    }
}

class Sub: Base() {

    override fun doWork() {
        super.doWork()
        printThis("From Sub")
    }
}