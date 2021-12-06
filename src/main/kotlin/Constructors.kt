class Add constructor(val a:Int, val b:Int){
    var c= a+b

}

fun main() {
    val add = Add(44,33)
    println("the sum of number ${add.c}")
}