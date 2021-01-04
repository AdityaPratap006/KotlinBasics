package object_oriented_programming

import java.lang.IllegalArgumentException

fun main() {
    var myCar = Car()
    println("Brand: ${myCar.brand}")
    myCar.maxSpeed = 240
    println("Max Speed: ${myCar.maxSpeed}")
    //  Error: myCar.model = "M5"
    println("Model: ${myCar.model}")
}

class Car() {
    lateinit var owner: String

    val brand: String = "BMW"
        // Custom getter
        get() {
            return field.toLowerCase()
        }

    var maxSpeed: Int = 250
        // Custom setter
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Max Speed cannot be less than 0")
        }

    var model: String = "7 series"
        private set

    init {
        this.owner = "Aditya"
    }
}
