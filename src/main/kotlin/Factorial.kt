fun main(){

    var n = FACT(6)

    print(n)


    val array = arrayOf(22,33,1,4,5,6,7,28,44)

    val ns = array.size
    val result = sum(array,ns)
}

fun FACT(num :Int):Long{
    return if(num == 1) num.toLong()
    else num * FACT(num-1)
}


fun FACT1(num :Int):Long{
    return if(num == 1) num.toLong()
    else num * FACT1(num-1)
}

fun sum (args:Array<Int> , Index :Int) :Int{
    return if(Index<=0) 0
    else (sum(args,Index-1)+args[Index-1])
}