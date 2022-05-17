package com.kotlin.oops.interfaces

class SendEmail(override val prop: Int) : EmailService {
    override fun sendEmail() {
       println("Prop is $prop , sending email .... ")
    }
}

fun main(args: Array<String>) {
    SendEmail(23).log() // calling
    SendEmail(23).sendEmail() // calling
}