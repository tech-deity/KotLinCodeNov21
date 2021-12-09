open class parent{
    val name:String=""
    init {
        println("parent class")
    }
    fun parentMethod(){
        println("This is parent method")
    }
    open fun papa()
    {
        println(" i am papa")
    }
}

class Child :parent(){
    val name2:String="vishal"
    init {
        println("this is child class")
    }

    fun childMethod(){
        println("this is child Method")
    }
    override fun papa(){

        println(" i am son of papa")

    }

    override fun toString(): String {
        return "name is $name2"
    }
}

fun main() {
    val c = Child()
    c.parentMethod()
    c.papa()
    println(c.toString())
}
