package com.example.kotlincodechallenges.sirius

class Student(var name: String) {
    // init() {} is not a thing in Kotlin
    init {
        println("Student has got a name as $name")
    }

    // var is not allowed in a Secondary constructor
    // this(sectionName) needs the ':' before it
    constructor(sectionName: String, id: Int) : this(sectionName) {}
}

/*
class Student (var name: String) {
    init() {
        println("Student has got a name as $name")
    }
    constructor(sectionName: String, var id: Int) this(sectionName) {}
}
 */

// Refactor this code using apply

class Message(message: String, signature: String) {
    val body = MessageBody()
    val array = arrayOf("String", 123, 1.2)

    init {
        body.text.apply {
            "$message \n $signature"
        }
    }
}

class MessageBody {
    var text = ""
}

/*
class Message(message: String, signature: String) {
  val body = MessageBody()

  init {
    body.text = message + "\n" + signature
  }
}

 */