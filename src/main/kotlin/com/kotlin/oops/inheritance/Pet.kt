package com.kotlin.oops.inheritance

import com.kotlin.oops.inheritance.Person

class Pet(name:String, type: String) {
  val type:String = type
  val name:String = name

  init {
      println("Pet name is $name and type of pet is $type")
  }
}


fun main() {
    val pets: MutableList<Pet> = mutableListOf()

    pets.add(Pet("Jackie", "Dog"))
    pets.add(Pet("Rano", "Cat"))

    val person = Person("Badri Paudel", 25, pets)

    println(person.pets)
}