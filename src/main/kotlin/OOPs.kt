fun main(){

    var i :Int = 20
    println(i.plus(22))

    val p1= Person("A",22)
    println(p1.canVote())

}
class Person(val name:String , var age:Int){

    fun canVote() :Boolean{
        return age>18
    }
}