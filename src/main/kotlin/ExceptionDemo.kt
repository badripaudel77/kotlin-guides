/*
 * All exception classes in Kotlin inherit the Throwable class.
 * Every exception has a message, a stack trace, and an optional cause.
 * Has try, catch & finally just like in java
 */

fun main() {
    // throw Exception("Exception ...")
    //throw IllegalArgumentException("Illegal arg exp")
    var result: Int = 0
    val num1: Int = 10
    val num2: Int = 0

    try {
        result = num1 / num2
    }
    catch (exception: Exception) {
        println("Exception occurred, message is : ${exception.message}")
    }
    finally {
        println("Always runs !!! ")
    }
}