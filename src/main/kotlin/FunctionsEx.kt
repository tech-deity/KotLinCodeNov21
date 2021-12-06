fun main()
{
    val array = arrayOf(1,2,3,4,5)
    val ns =array.size
    val result = sum1(array,ns)
    println("result is $result")
}

fun sum1 (args:Array<Int>,index :Int):Int{

    return if(index<=0) 0
    else (sum1(args , index-1) +args[index-1])
}

// lambda

