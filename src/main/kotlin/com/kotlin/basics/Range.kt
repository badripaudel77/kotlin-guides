/*
 * Range can be denoted with start..end eg : 1..10
 * Useful in loops
 */

fun main(args : Array<String>) {
    checkIfNumberIsInRange(1, 10, 100)
    checkIfNumberIsInRange(1, 10, 10)
    stepFun()
}

fun checkIfNumberIsInRange(start: Int, end: Int, number: Int) {
 if (number in start..end) println("Yes, number in the range")
    else println("No, number isn't in the range")
}

fun stepFun() {
    for (x in 1..10 step 2) {
        print("$x ")
    }
}