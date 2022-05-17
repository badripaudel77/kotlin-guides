/*
 ** Created by Badri Paudel
 * list can be of immutable [can't be changed]  and mutable [can be changed]
 */
fun main(arguments: Array<String>) {
    val array = Array(5) { i -> (i * i).toString() } // use array constructor and function that returns the values.
    array.forEach { it_ -> print("${it_.toDouble()} ") }
    println()
    arraysDemo()
}

fun arraysDemo() {
    // this list can't be changed, immutable list
    var eventStatuses = listOf("FINISHED", "BOOKED", "COMPLETED", "WAITING_FOR_CONFIRMATION")
    for (eventStatus in eventStatuses) {
        print("$eventStatus ")
    }

    // this list can be changed
    var eventStatuses_ = mutableListOf("FINISHED", "BOOKED", "COMPLETED", "WAITING_FOR_CONFIRMATION")
    eventStatuses_[0] = "hello"
    println("\n$eventStatuses_")
    eventStatuses_.removeAt(0) // as it is mutable
    println("\n$eventStatuses_")

    // arrays with arrayOf can have different types arrayOf("Mango", "Apple", "Banana", 44) is valid
    var fruits = arrayOf("Mango", "Apple", "Banana")
    fruits.forEachIndexed { index, any ->
        println("$index $any")
    }
}