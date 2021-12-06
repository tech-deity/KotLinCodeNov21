class ABC{
    val a:String = "outer Class"

    class DEF{
        var s1:String="Nested Class"
        fun nestedFunc(Str2:String):String{
            var s2=s1.plus(Str2)
            return s2
        }

    }
}

class CDE{
    val a:String ="Outer CLASS VARIABLE"

    inner class EFG{

        var str1:String ="Innner Class"
        fun innnerClassFunc():String{

            var strIn = a // inner class can access the property of outer class inside the inner class

            return strIn
        }
    }
}

fun main() {
    val nestedObject =ABC.DEF()
    val res = nestedObject.nestedFunc("Member Funtion")
    println(res)

    val obj = ABC()
    val res1 =obj.a
    print(res1)

    val outerObj = CDE()
    val innerObj = outerObj.EFG()
    val re1 = outerObj.a
    val re2 = innerObj.str1
    val re3 =innerObj.innnerClassFunc()

    println("$re1 --- $re2 --- $re3")

}