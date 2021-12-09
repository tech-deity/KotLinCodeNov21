open class Shape()
{
    open fun area() :Double{
        return 0.0
    }

}

class Circle(val radius :Double):Shape(){

    override fun area(): Double {
        return Math.PI * radius*radius
    }
}

class Rectangle(val length:Double, val b:Int):Shape(){

    override fun area(): Double {
        return length*b
    }
}

fun main() {
    val rectangle:Shape= Rectangle(2.0,8)
    print(rectangle.area())
}