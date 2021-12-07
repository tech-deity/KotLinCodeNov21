import java.util.*

class Student(nameparam:String, ageParam:Int){

    var name:String = nameparam
    get() {
       return field.uppercase(Locale.getDefault())

    }
    var age:Int=ageParam
    set(vala){
        if (vala>0)
        {field =vala}

        else{
          println("age cant be negative ")
        }
    }

}

fun main() {
    val obj =Student("vishal",-22)

    obj.age =-22
    obj.name="rahul rawat"

  //  println("name is ${obj.name} and age is ${obj.age}")

}