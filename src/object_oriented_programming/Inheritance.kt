package object_oriented_programming

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}

/**
 * The class that inherits the features of another
 * class is called the Sub class or Child class or
 * Derived class, and the class whose features are
 * inherited is called the Super class or Parent class
 * or Base class
 * */

open class Bike (override val maxSpeed: Double, val name: String, val brand: String): Drivable {
    open var range: Double = 0.0

    open fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}

class ElectricBike(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Bike(maxSpeed, name, brand) {
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String {
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("Electric Bike is braking!")
    }
}

fun main() {
    val diavel = Bike(320.0,"Diavel", "Ducati")
    val liveWire = ElectricBike(250.0,"LiveWire", "Harley-Davidson", 50.0)

    diavel.drive();

    // Polymorphism
    diavel.drive(200.0)
    liveWire.drive(120.0)

    liveWire.extendRange(200.0)
    liveWire.drive()

    diavel.brake()
    liveWire.brake()
}