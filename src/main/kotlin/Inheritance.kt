open  class Parent{

    val name:String="Parent"
    init {

        println("this is parent class ")
    }


    fun myMethod(){
        print("this is parent method")
    }


}


class child :Parent(){

    init {
        println("this is child class")
    }

    fun childMethod(){

        println("this is child method")
    }

}

fun main() {

    val c =child()
    c.myMethod()

}