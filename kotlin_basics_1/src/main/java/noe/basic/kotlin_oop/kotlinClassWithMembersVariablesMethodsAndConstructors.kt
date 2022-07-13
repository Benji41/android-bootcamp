package noe.basic.kotlin_oop

fun main(){
    var person = completePerson("Benjamin",23)
    println(person.whatsMyHobby())
    println("my name is: ${person.firstName} and i am ${person.age} years old")
    var person2 = completePerson(23)
}


class completePerson(firstName:String="ningun nombre"){
    //properties
    var firstName:String =firstName
    var lastName:String =""
    var age:Int =0
    //methods
    fun whatsMyHobby():String{
        return "Driving my car"
    }
    //second constructor
    //necesita retornar un objeto creado con el constructor principal
    constructor(age:Int):this(){
        println(age)
        //no se puede inicializar dentro de este constructor
    }
    constructor(firstName: String,age:Int):this(firstName){
        this.age = age
        this.firstName = firstName
    }
}