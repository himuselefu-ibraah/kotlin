open class Shape{
    open fun draw (){
        println("Drawing a Shape")
    }
}
class Circle:Shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}
class Square:Shape(){
    override fun draw(){
        println("Drawing a square")
    }
}

fun main() {
    var sh = Shape()
    sh.draw()
    var ci = Circle()
    ci.draw()
    var sq = Square()
    sq.draw()
}