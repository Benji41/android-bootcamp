package noe.basic.kotlin_basics_1

fun main(){
    var mySaldo :String? = "300 pesos"
    //let permite correr acciones siempre y cuando el valor sea diferente de null
            //permite almacenar valores nulos , corre el siguiente bloque de codigo si el valor es diferente a nulo
    mySaldo?.let { println("valor: $mySaldo tamanio: ${mySaldo?.length}") }
    mySaldo =null
    mySaldo?.let { println("valor: $mySaldo tamanio: ${mySaldo.length}") }
}