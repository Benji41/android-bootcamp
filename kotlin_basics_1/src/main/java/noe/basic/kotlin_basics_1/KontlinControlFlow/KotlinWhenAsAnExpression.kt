package noe.basic.kotlin_basics_1

fun main() {
    var myAge: Any = 23
    val response = when (myAge) {
        in 1..18 -> "Kid"
        19, 20 -> {
            //alguna accion va antes de regresar el valor
            println("xd")
            "kiddo"
        }
        in 21..25 -> "el morro"
        in 80 downTo 0 -> "metamorfosis xd"
        !is Int -> "defuk is this"
        else -> "reptilian"
    }
    println(response)
}