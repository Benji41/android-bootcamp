package noe.basic.kotlin_oop

data class PersonData(val firstName:String, val lastName:String,var age:Int=-1,var hobby :String?="looking for a new one",var job:String?="none",var money:Float?=0F)

fun main(){
    var person = PersonData("Noe","Reynoso",23)
    println(person)
    //copy and modify an existing object
    var person2 = person.copy("Benjamin","Aguirre")
    println(person2)
    //deconstruct
    val (firstName,LastName) = person2
    println("$firstName $LastName")
}