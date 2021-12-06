class Automobile2(val name:String , val tyer:Int , val maxSeat:Int,hasAirbags:Boolean, val engineType:String){

    init {
        println("$name is created ")
    }
    init {
        println("this is second init block")
    }

    fun applyBreak(){

    }
    fun drive(){

    }

    constructor(nameparam:String,engineparam:String):
            this(nameparam,4,5,true,engineparam)
}

fun main() {

    val car =Automobile2("sportsCar","Eletric")
    val car2 = Automobile2("Luxury  car ",4,5,true,"Petrol")

    println("car is ${car.name} its engine is ${car.engineType}")
    println("car is ${car2.name} it has ${car2.tyer} ,and it has engine of ${car2.engineType}")

}

class de()