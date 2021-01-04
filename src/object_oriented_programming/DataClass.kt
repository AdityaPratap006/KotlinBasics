package object_oriented_programming

data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "John")

    user1.name = "Aditya"
    val user2 = User(1, "Aditya")

    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name = "Dennis")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints Denis

    val (id, name) = updatedUser
    println("id = $id, name = $name")
}