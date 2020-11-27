fun main() {
//    arithmetic()
//    comparison()
    assignment()
    incrementAndDecrement()
}

fun arithmetic() {
    // Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    println("Result: $result")

    result /= 2
    println("Result2: $result")

    result *= 4
    println("Result3: $result")

    val remainder = 15 % 2
    println("Remainder: $remainder")

    val num1 = 24.0
    val num2 = 54
    val divResult = num2 / num1
    println("Division Result: $divResult")
}

fun comparison() {
    // Comparison operators (==, !=, <, >, <=, >=)
    val val1 = 5
    val val2 = 3
    val isEqual = val1 == val2
    println("isEqual: $isEqual")

    val isNotEqual = val1 != val2
    println("isNotEqual: $isNotEqual")

    val isSmaller = val1 <= val2
    println("isSmaller: $isSmaller")

    val isGreater = val1 >= val2
    println("isGreater: $isGreater")

    val isStrictlySmaller = val1 < val2
    println("isStrictlySmaller: $isStrictlySmaller")

    val isStrictlyGreater = val1 > val2
    println("isStrictlyGreater: $isStrictlyGreater")
}

fun assignment() {
    // Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")

    myNum *= 4
    println("myNum is $myNum")
}

fun incrementAndDecrement() {
    var myNum = 10
    myNum++
    println("myNum: $myNum")
    println("myNum: ${myNum++}")
    println("myNum: ${++myNum}")
    println("myNum: ${--myNum}")
    println("myNum: ${myNum--}")
    println("myNum: ${--myNum}")
}
