fun main() {
//    nullableDemo()
//    elvisOperatorDemo()
    notNullAssertionDemo()
}

fun nullableDemo() {
    var name: String = "Aditya"
//    name = null -> Compilation ERROR
    var nullableName: String? = "John Wick"
//    nullableName = null
    var len = name.length
    var len2 = nullableName?.length
    println("${nullableName?.toUpperCase()}")
    nullableName?.let { println(it.length) }
}

fun elvisOperatorDemo() {
    var nullableName: String? = "Aditya Pratap"
//    nullableName = null

    // ?: Elvis operator
    val name = nullableName ?: "Guest"
    println("name is $name")
}

fun notNullAssertionDemo() {
    var nullableName: String? = "Aditya Pratap"
//    nullableName = null
    println(nullableName!!.toLowerCase())
}