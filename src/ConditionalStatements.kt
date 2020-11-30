fun main() {
    demoIfStatement()
    demoWhenStatement()
}

fun demoIfStatement() {
    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    } else {
        println("use technique")
    }

    var name = "Aditya"

    if (name == "Aditya") {
        println("Welcome home Aditya!")
    } else {
        println("Who are you?")
    }

    val isRaining = true
    if (isRaining) {
        println("It's rainy")
    }
}

fun demoWhenStatement() {
    var age = 20
    when {
        age >= 21 -> {
            println("Now you may drink in the US")
        }
        age >= 18 -> {
            println("You may vote now")
        }
        age >= 16 -> {
            println("You may drive now")
        }
        else -> {
            println("You're too young")
        }
    }

    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> {
            println("Invalid Season")
        }
    }

    var month = 12
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> {
            println("Summer")
        }
        in 9..11 -> {
            println("Fall")
        }
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var x: Any = "13.37f"
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is NOT a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}