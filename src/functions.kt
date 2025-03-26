fun main() {

    //standard library functions/predefined functions
    var x = Math.sqrt(144.0)
    println("The sqroot of 144 is $x")
    var y = Math.round(66.5)
    println("The output is $y")

    school()
    student("Joseph",21)
    student("Jacinta",19)
    employee("Peter",400000,false)
    employee("Amanda",400000,false)
    employee("Juliet",400000,false)
}

//User-Defined Functions
fun school (){
    println("eMobilis")
}

//parameters-(variable) and arguments
fun student(name:String,age:Int){
    println("$name is $age years old")

}

fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary. Disability $disability")

}