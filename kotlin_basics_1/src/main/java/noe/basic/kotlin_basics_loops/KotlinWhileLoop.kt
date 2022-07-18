package noe.basic.kotlin_basics_loops

fun main() {
    var x = 0
    while (x < 10) {
        if (x == 8) {
            break
        }/*
        if (x % 2 != 0) {
            continue
        }*/
        println("$x")
        x++
    }
}