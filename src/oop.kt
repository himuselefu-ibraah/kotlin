fun main() {

    var doctor1 = Person()
    println(doctor1.name)
    doctor1.speak()
}

class Person{
    var name ="Jane"
    var age = 43
    var department ="Department3"

    fun speak(){
        println("Doctor is speaking")
    }

}