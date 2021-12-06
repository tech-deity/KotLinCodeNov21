class Automobile1(val name1 :String , val tyer1:Int , val maxSeats1:Int , hasAirBags:Boolean){


    init {
        println("$name1 is created this is init block")
    }

    init {
        println("this is second init block")
    }


}

fun main() {
    val car1=Automobile1("sportscar",4,2,true)

    println("my ${car1.name1} has ${car1.tyer1} tyers and max seats are ${car1.maxSeats1}")

}