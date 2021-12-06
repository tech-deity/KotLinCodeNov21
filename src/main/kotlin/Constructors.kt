class Add constructor(val a:Int, val b:Int) // primary constructor

{
    var c= a+b

}

class Automobile(val name:String,val tyer:Int, val maxSeat:Int) // primary constructor
{

    //init block is used if we want to run some set of statement when we create an object then we use init block

    init {
        println("$name is created")
    }

    init {
        println("Second init block")
    }
    fun drive(){

    }

    fun applyBreak(){


    }
}


class Person1(nameParam:String,ageParam:Int){
    val name =nameParam
    val age = ageParam
}

fun main() {
    val add = Add(44,33)
    println("the sum of number ${add.c}")

    val car =Automobile("Car",4,5)
    println(" ${car.name}  --- ${car.tyer} --- ${car.maxSeat}")

    var person1 = Person1("ravi",22)
    println(person1.age)
    println(person1.name)
}