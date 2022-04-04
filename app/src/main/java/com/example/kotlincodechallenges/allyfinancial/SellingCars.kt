package com.example.kotlincodechallenges.allyfinancial

import java.time.LocalDateTime


fun main() {
    val sellingCars = SellingCars()
    val listOfCars = listOf(
        Car("Chevy", LocalDateTime.now()),
        Car("Ford", LocalDateTime.now()),
        Car("Pontiac", LocalDateTime.now()),
        Car("Dodge", LocalDateTime.now()),
        Car("Dodge", LocalDateTime.now()),
        Car("Dodge", LocalDateTime.now()),
        Car("Dodge", LocalDateTime.now()),
        Car("Dodge", LocalDateTime.now()),
        Car("Nissan", LocalDateTime.now()),
        Car("Ford", LocalDateTime.now()),
        Car("Ford", LocalDateTime.now()),
    )
    sellingCars.run {
        // adding Cars
        for (car in listOfCars) {
            addCar(car)
        }

        // return and remove first car in queue
        getOldestCar()

        // look for the oldest Chevy -> should not be there
        findOldestOfType("Chevy")
        findCoerce("Ford")

        // look for the oldest Ford-> should not be there
        findOldestOfType("Ford")

        // show all of a type of car
        showListOfMakes("Dodge")
        findCoerce("Dodge")

    }
}

data class Car(
    val make: String,
    val arrival: LocalDateTime,
    val milli: Long = System.nanoTime()
)

class SellingCars {
    private val carLot = ArrayDeque<Car>()

    fun addCar(car: Car) {
        carLot.add(car)
        println("Vehicle: $car")
    }

    fun getOldestCar(): Car {
        println("Selling time: ${LocalDateTime.now()}")
        return carLot.removeFirst()
    }

    fun findOldestOfType(make: String) {
        val temp: List<Car> = carLot.filter { it.make == make }


        if (temp.isEmpty()) {
            println("Car not found")
        } else {
            println(temp[0])
//            carLot.remove(temp[0])
        }
    }

    fun findCoerce(brand: String) {
        val oldestCar = carLot.filter { it.make == brand}


        println("Oldest car of Type: $oldestCar")
    }

    fun showListOfMakes(make: String) {
        println("----List of $make vehicles----")
        for (i in carLot) {
            if (make == i.make) println(i)
        }
    }
}

fun Car.showSellingTime() {

}