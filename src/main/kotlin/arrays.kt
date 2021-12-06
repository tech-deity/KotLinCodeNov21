fun main(){

    var arr = arrayOf("one","two","three")
    var arr1 :Array<Int> = arrayOf(1,2,3)
    var arr2 = arrayOf<Int>(22,33,2)

    for(i in arr){
        println(i)
    }
// to print element and index

    for ((i,e) in arr.withIndex())
        println("$i - $e")

    println("value at2 ${arr.get(2)}")
    println("size of the array is  ${arr.size}")
    println("set the value at 2 ")
    arr.set(2,"hello ji")

    for((i,e) in arr.withIndex())
        println("$i -- $e")
}