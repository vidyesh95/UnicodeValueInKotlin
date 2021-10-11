import java.util.*

// Kotlin program to find Unicode value of a character
fun main(args: Array<String>) {
    // Unicode table at https://unicode-table.com/en/
    val char = '§'
    // ASCII logic
    val ascii= char.code
    // Unicode logic
    val uni= String.format("u+%04x", char.code).uppercase(Locale.getDefault())

    println("The ASCII value of $char is: $ascii")
    println("The Unicode value of $char is: $uni")
}