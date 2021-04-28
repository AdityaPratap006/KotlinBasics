fun addNumber(a: Int, b: Int) {
    val result = a + b
    println(result)
}

val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

fun main() {
    addNumber(5, 10)
    println(sum(42, 65))
}