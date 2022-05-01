import org.jetbrains.annotations.NotNull

/*
 * Class in kotlin has same intention as in other language like Java
 * Value can be passed during class decalration in it's body [an alternative to constructor]
 */
class Shape(var length: Double, var breadth: Double) {
 private val perimeter = 2 * (length + breadth)
    fun printPerimeter() : Double {
        return perimeter
    }
}

class CustomerUser {
    var isNotExpired : Boolean = true
    lateinit var username : String
    lateinit var password: String
    lateinit var fullname: String
    
    constructor(@NotNull fullname: String, isNotExpired : Boolean = true, @NotNull username: String, @NotNull password:String) {
        this.isNotExpired = isNotExpired
        this.username = username
        this.password = password
        this.fullname = fullname
    }
    
    fun authenticateUser(@NotNull fullname: String, isNotExpired: Boolean, username: String, password: String) {
        // check if user is authenticated... 
        println("User $fullname with username $username and isNotExpired ?  $isNotExpired")
    }
}

fun main(args : Array<String>) {
   // NOTE : kotlin doesn't have new Keyword
    val customerUser = CustomerUser("Badri Paudel", true, "bp@test.com", "BPPASSWORD")
    println(customerUser.authenticateUser("Badri Paudel", true, "bp@test.com", "BPPASSWORD"))

    val shape = Shape(5.00, 3.00)
    println("The perimeter of the given shape is : ${shape.printPerimeter()}")
}

