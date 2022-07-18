package noe.basic.kotlin_oop

fun main() {
    var person = Person()
    //crear una instancia con algun argumento definido
    var person2 = Person(firstName = "Noe")
}

class Person(firstName: String = "sin nombre", lastName: String = "sin apellido") {
    init {
        println("nombre: $firstName apellido: $lastName")
    }
}
