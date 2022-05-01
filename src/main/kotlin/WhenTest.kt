/*
 ** when statement is alternative to if else ...
 * when one value is passed , do this
 * if another value is passed do this
 * and so on...
 */

fun main(arguments: Array<String>) {
  println(whenTest(22))
  println(whenTest(1))
  println(describe(1L))
  println(describe("Hello"))
}

fun whenTest(number: Int): String =
    when (number) {
        1 -> "Number is one" // when number == 1
        // ..
        else -> "Number is other than one, it's $number"
    }

// we also can test or any type

fun describe(value : Any) {
    when(value) {
        "hello"   -> println("hello is passed")
        10        -> println("number 10 is $value  passed")
        is Long   -> println("long number is there..")
    }
}