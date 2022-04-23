/*
 ** Variables in kotlin are created with keyword val [that can't be reassigned] and var that can be reassigned
 * Kotlin supports $variable name just like groovy ${variable}
 * also concatenation can be done with + operator as well.
 * Can give type to variables as kotlin is statically typed language. var variableName :type = "initial value"
 * types are inferred as well , vale GREET = "Namaste" , here String type will be inferred by Kotlin.
 * But when no initialization is done, type needs to be mentioned explicitly.
 */

fun variablesDemo() {
    val GREET = "Namaste" // val is keyword for not replaceable values
    var name :String // var is for variables i.e re-assigning is  possible
    name = "Badri Paudel"
    println("$GREET $name")
    name = "John Doe"
    println("After modification : $GREET $name")
}

fun main(args : Array<String>) {
    variablesDemo()
}

