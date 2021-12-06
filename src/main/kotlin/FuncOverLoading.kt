fun main(){

    println(adds(22,3))
    println(adds(33.0,2.0))

    //name argument

    println("name argument ${adds(a=2,b=44)}")

    println("name argument ${adds(b=2.0,a=44.0)}")


}

fun adds(a:Int,b:Int):Int{
    return a+b
}
fun adds(a:Double,b:Double):Double{

    return a+b
}