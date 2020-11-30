fun main() {
    myFunction()

    // arguments
//    val sum = addUp(4, 27)
//    println("sum = $sum")
    val average = avg(5.58, 13.47)
    println("average = $average")
}

fun myFunction() {
    println("Called from myFunction")
}

// Parameter (input)
fun addUp(a: Int, b: Int): Int {
    // output
    return a + b
}

fun avg(a: Double, b: Double): Double {
    return (a + b) / 2;
}