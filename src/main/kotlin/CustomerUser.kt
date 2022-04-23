import org.jetbrains.annotations.NotNull

/*
 * Class in kotlin has same intention as in other language like Java
 *
 */
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
        println("User $fullname with username $username is $isNotExpired == true ? 'active': 'not active'")
    }
}

