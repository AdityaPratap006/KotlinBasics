package object_oriented_programming

interface Weapon {
    val name: String
    val type: String
    val accuracy: Double
    val damage: Double
    fun fire() {
        println("firing weapon")
    }
}

class Shotgun(
        override val name: String,
        override val accuracy: Double,
        override val damage: Double
) : Weapon {
    override val type = "shotgun"

    override fun fire() {
        println("banggg!")
    }
}