/*
 ** Created by Badri Paudel on 23rd april 2022
 * Just like java, kotlin also has an entry point to project, and it's the main function
 * Semicolons are optional
 */
fun main(args: Array<String>) {
    // NOTE : kotlin doesn't have new Keyword
    val customerUser = CustomerUser("Badri Paudel", true, "bp@test.com", "BPPASSWORD")
    println(customerUser.authenticateUser("Badri Paudel", true, "bp@test.com", "BPPASSWORD"))
}
