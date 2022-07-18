package noe.basic

fun main() {
    println(addUp(1, 2))
}

//tipo de parametro         tipo de valor que regresara
fun addUp(a: Int, b: Int): String {
    return "el resultado de la suma es:${a + b}"
}