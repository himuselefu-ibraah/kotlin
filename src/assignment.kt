import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number: ")
    var num = read.nextInt()

    println("Enter second number: ")
    var numb = read.nextInt()

    println("Enter third number: ")
    var number = read.nextInt()

    val largest = if (num>=numb&&num>=number){
        num
    }else if (numb>=num&&numb>=number){
        numb
    }else{
        number
    }
println("The largest number is $largest")

}