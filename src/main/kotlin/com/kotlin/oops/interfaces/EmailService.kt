package com.kotlin.oops.interfaces
/*
 ** Interfaces are used to achieve abstraction principle
 *  What makes them different from abstract classes is that interfaces cannot store a state.
 */
interface EmailService {
    val prop: Int // abstract

    fun sendEmail() // no implementation

    fun log() {
        // optional body
        println("EmailService file.")
    }
}
