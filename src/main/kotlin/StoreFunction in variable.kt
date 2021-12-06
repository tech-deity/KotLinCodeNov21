import kotlin.math.pow

fun main(){

    var fn = ::addition
    println(fn(33.0,22.0))

    var fn1 = :: power
    println(power(8.0,2.0))

}

fun addition(a:Double,b:Double):Double{

    return  a+b
}
fun power(a:Double , b:Double) :Double
{
    return a.pow(b)
}