package com.example.kotlincodechallenges

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    // cannot run outside a coroutine scope
//    delay(1000L)

    runBlocking {
        // inside the coroutine scope
        launch {
            delay(1000L)
            println("Hello World")
        }
    }
}