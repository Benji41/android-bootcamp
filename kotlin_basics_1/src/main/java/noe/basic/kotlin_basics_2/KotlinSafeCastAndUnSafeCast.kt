package noe.basic.kotlin_basics_2

fun main() {
    //unsafe
    //val obj:Any? = null
    /*val str:String = obj as String
    println(str)*/


    //safe cast
    var obj2: Any? = "Kotlin"
    //safe cast
    // throws null instead of an exception
    var str2: String? = obj2 as? String
    println(str2)
    obj2 = null
    str2 = obj2 as? String
    println(str2)
}