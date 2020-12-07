package object_oriented_programming

fun main() {
    val johnWick = Person("John", "Wick")
    val aditya = Person()
    val adityaRathore = Person(lastName = "Rathore")
}

class Person(firstName: String = "Aditya", lastName: String = "Pratap") {

    // Initializer Block
    init {
        println("Created a Person named $firstName $lastName!")
    }


}