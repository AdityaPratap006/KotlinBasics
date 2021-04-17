fun findAverage() {
    val arrayList = ArrayList<Double>()

    arrayList.add(10.0)
    arrayList.add(25.0)
    arrayList.add(50.47)
    arrayList.add(63.74)
    arrayList.add(84.0)

    var sum: Double = 0.0
    for (num in arrayList) {
        sum += num
    }

    val average = sum / 5
    println("average: $average")
}

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println("...print ArrayList...")
    for (item in arrayList) {
        print("$item ")
    }
    println()
    findAverage()
}