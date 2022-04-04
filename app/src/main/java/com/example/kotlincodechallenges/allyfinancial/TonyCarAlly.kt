package com.example.kotlincodechallenges.allyfinancial

//class CarCollection {
//
//    private val coll = mutableListOf<CarAlly>()
//
//    fun addCar(car: CarAlly) {
//        coll.add(car)
//    }
//
//    fun removeOldest() {
//
//    }
//
//    fun removeOldestByType(type: String): List<CarAlly> {
//
//    }
//
//    fun getCarsByType(type: String): List<CarAlly> {
//        if (!coll.containsByType(type)) return emptyList()
//
//        return coll.filter { it.type == type }.map { it }
//    }
//
//    private fun MutableList<CarAlly>.containsByType(type: String): Boolean {
//        this.forEach {
//            if (it.type == type)
//                return true
//        }
//
//        return false
//    }
//}
//
//data class CarAlly(
//    val type: String
//)