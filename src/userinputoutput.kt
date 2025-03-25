import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your first name:")
    var firstname = readln()
    println("Hello there , $firstname:")

    println("How old are you?")
    var age = read.nextInt()
    println("User is $age years old")

    println("Enter your weight:")
    var weight =read.nextDouble()
    println("My weight is $weight kilograms")

}