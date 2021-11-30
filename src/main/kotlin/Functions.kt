fun main(){

    val res = add1(22,333)
    println(res)

    val r = ::add1
    println("this is out put via where we have used a variable as function  ${r(20,10)}")


}
fun add1(a:Int,b:Int):Int{
    return  a+b
}