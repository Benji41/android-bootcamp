package noe.basic.kotlin_oop.abstractClasses

fun main() {
    var medioTransporte1 = Bicycle(1, null, 50F, 2, "comida")
    var medioTransporte2 = Car(5, 400F, 1000F, 4)
    var medioTransporte3 = Car(5, null, 1000F, 4)
    var medios = arrayOf(medioTransporte1, medioTransporte2, medioTransporte3)
    for (obj in medios) {
        println(obj.charge())
        println(obj.drive())
        println(obj)
    }
}