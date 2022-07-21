package com.example.kotlincodechallenges.wellsfargo

// 2. Write code for implementing Secondary constructor in Kotlin

// primary constructor -> concise way to initialize a class
// secondary constructor -> allows you to put additional initialization logic
fun main() {

}

// primary
open class ConstructorExample {

    constructor(coolString: String) {

    }

    constructor(coolInt: Int) {

    }

}

class SecondExample: ConstructorExample {

    constructor(str:String): super(str)

    constructor(int:Int): super(int)

}

//class ConstructorExample2(a: Int, b: Int) {
//    var c = a + b
//
//    constructor()
//}