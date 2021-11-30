fun main(){

    var n = FACT(6)

    print(n)
}

fun FACT(num :Int):Long{
    return if(num == 1) num.toLong()
    else num * FACT(num-1)
}