/*
 * Inheritance is one of the main features of the OOP language like Java, Groovy, Kotlin etc.
 * In kotlin Inheritance works like in Java
 * By default kotlin class are not inheritable, kotlin classed that are needed to invlove in inheritance are preceded by `open` keyword
 */

// adding open to Human class makes this class to be available in child class
open class Human {
    var age :Int = 0
    var name :String?

    constructor(age:Int, name: String?) {
        this.age = age
        this.name = name
    }

    open fun getDetails() {
        println("Parent class has no value. Child classed Will override with their own value.")
    }

    fun printExtraThing(extraFeature :String) {
        println("$extraFeature is new here...")
    }
}

class John(age: Int, name: String) : Human(age, name) {
  override fun getDetails() {
      println("${this.name} is ${this.age} years old.")
  }
}

class Dia(age: Int, name: String) : Human(age, name) {
    override fun getDetails() {
        super.getDetails() // calls parent class' method
        super.printExtraThing("190 cm")
        println("${this.name} is ${this.age} years old.")
    }
}

fun main() {
    val human = Human(0, null)
    human.getDetails()

    val john = John(22, "John Doe")
    john.getDetails()

    val dia = Dia(24, "Dia Doe")
    dia.getDetails()
}