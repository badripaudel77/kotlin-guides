/*
 ** Variables in kotlin are created with keyword val [that can't be reassigned] and var that can be reassigned
 * Kotlin supports $variable name just like groovy ${variable}
 * also concatenation can be done with + operator as well.
 */

fun variablesDemo() {
    val GREET = "Namaste"
    var name :String
    name = "Badri Paudel"
    println("$GREET $name")
    name = "John Doe"
    println("After modification : $GREET $name")
}

fun main(args : Array<String>) {
    variablesDemo()
}

