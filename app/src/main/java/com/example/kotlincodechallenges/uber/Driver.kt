package com.example.kotlincodechallenges.uber

data class Driver(
    val id: Int,
    var enabled: Boolean
)

fun main() {
    val driver1 = Driver(1, true)
    val driver2 = Driver(2, true)
    val driver3 = Driver(3, true)
    val allDrivers = mutableListOf(driver1,driver2,driver3)
    val currentDrivers = allDrivers
    val removedDriver = currentDrivers.removeFirst()
    removedDriver.enabled = false
    print("${allDrivers.size} ${currentDrivers.size} ${driver1.enabled}")
}