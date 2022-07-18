package noe.basic.kotlin_basics_loops

fun main() {
    //retorna el valor en cada posicion
    val myName = "Noe Benjamin Reynoso Aguirre"
    for (i in myName) {
        println("${i}")
    }
    println("-----------")
    //dentro de un intervalo numerico
    for (i in 0..9) {
        println(i)
    }
    println("-----------")
    //definiendo el inicio y final
    for (i in 1 until 10) {
        println(i)
    }
    println("-----------")
    //definiendo un inicio mayor que un limite final menor
    for (i in 9 downTo 0) {
        println(i)
    }
    println("-----------")
    //defines el incremento del indice
    for (i in 0 until 9 step 2) {
        println(i)
    }
    println("-----------")
    for (i in 9 downTo 0 step 2) {
        println(i)
    }
    println("-----------")
    for (i in 0 until 10000) {
        if (i == 9001) {
            println("its over 9000")
        }
        println(i)
    }


}