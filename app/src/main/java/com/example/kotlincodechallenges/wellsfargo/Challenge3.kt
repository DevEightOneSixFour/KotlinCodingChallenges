package com.example.kotlincodechallenges.wellsfargo

// 3. Write code for thread safe singleton in Java

fun main() {
    val singleClass : SingleClass? = getObject()
}

@Synchronized
fun getObject (): SingleClass {
    var singleObject : SingleClass? = null
    if (singleObject == null){
        singleObject = SingleClass()
    }
    return singleObject
}

class SingleClass {

}