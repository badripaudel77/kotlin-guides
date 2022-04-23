/*
 * very similar to any other programming languages' operators but for many operations kotlin has
 * many interesting built-in features with fancy methods. like varOne.plus(varTwo) and so on...
 */
fun main(args : Array<String>) {
    operators()
}

fun operators()  {
    val PI = 3.14
    var radius = 5

    val area = PI * radius * radius
    println("the area of a circle with radius $radius is $area")

    val a: Int = 3
    val b: Int = 30
    val divResult = b.div(a) // b is divided by a
    // similarly we can do
    // b.minus(a) ; b.times(a); b.plus(a); b.toDouble(); b.toString(); b.toShort(); b.compareTo(a);
    println("$b divided by $a is $divResult")
    println("Is $b greater than $a ?   $b.compareTo(a) == 1")
    println("The value of  $b raise to the power of $a ($b, $a) " + Math.pow(b.toDouble(),a.toDouble()).toInt())
}