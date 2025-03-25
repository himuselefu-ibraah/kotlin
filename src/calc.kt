import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter operator where 1(+) 2(-) 3(*) 4(/) (Operator)")
    var ope = read.nextInt()

    println("Enter first number: ")
    var num = read.nextInt()

    println("Enter second number: ")
    var number = read.nextInt()

    var result = when (ope){
        1->num+number
        2->num-number
        3->num*number
        4->num/number
        else ->"Invalid operator"
    }
    println("The day is $result")
}