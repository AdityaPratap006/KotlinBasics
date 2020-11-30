fun main() {
//    whileLoopDemo()
//    whileLoopDemo2()
//    doWhileLoopDemo()
    forLoopDemo()
}

fun whileLoopDemo() {
    var x = 1
    while (x <= 10) {
        print("$x ")
        ++x
    }
    println("\nwhile loop is done!")
}

fun whileLoopDemo2() {
    var x = 100
    while (x >= 0) {
        print("$x\t")
        if (x % 20 == 2) {
            println()
        }
        x -= 2
    }
}

fun doWhileLoopDemo() {
    var x = 12
    do {
        print("$x ")
        x++
    } while (x <= 10)
    println("\ndo while loop is done!")
}

fun forLoopDemo() {
    for (num in 1..10) {
        print("$num ")
    }
    println("\nfor loop is done!")

    for (num in 1 until 24) {
        print("$num ")
    }

    println("\n_______")

    for (num in 20 downTo 1 step 2) { // Same as - for(i in 10.downTo(1).step(2))
        print("$num ")
    }
}