package noe.basic.kotlin_basics_1

fun main(){
    //elvis operator, este permite a una variable que es non nullable asignarle una variable que si almacena valores nulos, en el caso de que la variable nullable tiene un valor nulo, la variable
    //apenas inicializada almacenara un default
    var mySaldo :String? = "200 pesos"
    var saldoDeSamsung = mySaldo ?: "No tiene saldo"
    println(saldoDeSamsung)
    mySaldo =null
    saldoDeSamsung = mySaldo ?: "No tiene saldo"
    println(saldoDeSamsung)
}