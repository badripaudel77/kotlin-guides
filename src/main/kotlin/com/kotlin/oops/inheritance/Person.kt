package com.kotlin.oops.inheritance

// class Person constructor(fullname: String, age:Int){
class Person(fullname: String, age:Int, pets: MutableList<Pet> = mutableListOf()){
    val name = "${fullname.uppercase()}"
    val pets: MutableList<Pet> = pets
    // init block
    init {
        println("Fullname is $name")
    }
}