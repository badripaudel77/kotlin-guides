
fun main(arguments: Array<String>) {
    println("Let's test functions in Kotlin")
    noArgFunction()
    argFunctionWithNoRT("badri", "badripw");
    argFunctionWithRT("dasfs4564343")
    val summation:Int = addNumbers(23,2)
    println("summation of given numbers is : $summation")
}

// Unit means returns nothing, even if not specified, it's Unit by Default.
fun noArgFunction(): Unit {
  // write the logic here..
  println("This function, returns nothing.")
}

// with args but no return type
fun argFunctionWithNoRT(userName: String, password:String) {
    if(userName == "badri" && password == "badripw")
        println("user is verified.")
    else println("the user isn't verified.")
}

fun argFunctionWithRT(authToken: String): Boolean {
    if (authToken.equals("dasfs4564343"))
        return true
    return false
}

// add numbers using function as expression
// here return type will be inferred by the compiler.
fun addNumbers(num1: Int, num2: Int) = num1.plus(num2)
