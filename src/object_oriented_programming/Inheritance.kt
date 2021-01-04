package object_oriented_programming

/**
 * The class that inherits the features of another
 * class is called the Sub class or Child class or
 * Derived class, and the class whose features are
 * inherited is called the Super class or Parent class
 * or Base class
 * */

open class Bike(val name: String, val brand: String) {
    open var range: Double = 0.0

    open fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}

class ElectricBike(name: String, brand: String, batteryLife: Double) : Bike(name, brand) {
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }

    fun drive() {
        println("Drove for $range KM on electricity")
    }
}

fun main() {
    var diavel = Bike("Diavel", "Ducati")
    var liveWire = ElectricBike("LiveWire", "Harley-Davidson", 50.0)

    diavel.drive(200.0)
    liveWire.drive(120.0)

    liveWire.extendRange(200.0)
    liveWire.drive()

}