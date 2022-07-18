package noe.basic.kotlin_oop.inheritance

interface Functions {
    var maxSpeed: Float
    fun charge(): String
    fun drive(): String
    fun drive(maxSpeed: Float): String {
        return "hola"
    }
}