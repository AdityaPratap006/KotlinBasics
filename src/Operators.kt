fun main() {
    // Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    print("Result: $result")

    result /= 2
    print("\nResult2: $result")

    result *= 4
    print("\nResult3: $result")

    val remainder = 15 % 2
    print("\nRemainder: $remainder")

    val num1 = 24.0
    val num2 = 54
    val divResult = num2 / num1
    println("\nDivision Result: $divResult")

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