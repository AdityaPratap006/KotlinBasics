package object_oriented_programming

fun main() {
    val johnWick = Person("John", "Wick", 45)
    val aditya = Person(age = 20)
//    val adityaRathore = Person(lastName = "Rathore")
    johnWick.stateHobby()
    johnWick.hobby = "kill people!"
    johnWick.stateHobby()

    aditya.hobby = "play pc games!"
    aditya.stateHobby()
}

class Person(firstName: String = "Aditya", lastName: String = "Pratap") {

    // Member Variables - Properties
    var age: Int? = null
    var hobby: String = "watch Netflix"
    var firstName: String? = null
    // Initializer Block
    init {
        this.firstName = firstName
        println("Created a Person named $firstName $lastName!")
    }

    // Member - Secondary Constructor
    constructor(firstName: String = "Aditya", lastName: String = "Pratap", age: Int) : this(firstName, lastName) {
        this.age  = age
        println("$firstName $lastName is ${this.age} years old")
    }

    // Member Functions - Methods
    fun stateHobby() {
        println("$firstName's hobby is $hobby")
    }

}