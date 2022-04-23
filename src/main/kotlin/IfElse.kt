import org.jetbrains.annotations.NotNull

fun main(args : Array<String>) {
    ifElseDemo(24, "Badri")
    ifElseDemo(24, "Paudel")
    ifElseDemo(18, "Ram")
    ifElseDemo(17, "John")
    ifElseDemo(18, null, 20)
}

// adding ? can allow value to be null
fun ifElseDemo(age: Int, @NotNull person: String?, minAcceptedAge: Int = 18) {
    if(age >=minAcceptedAge)
        println("$person is eligible to vote at the age of $age in coming election all across the country.")
    else
        println("$person is not eligible to vote at the age of $age in coming election all across the country.")
}