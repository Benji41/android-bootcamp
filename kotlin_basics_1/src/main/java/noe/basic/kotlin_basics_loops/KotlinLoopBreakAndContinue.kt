package noe.basic.kotlin_basics_loops

fun main() {
    //TODO esto debe de ser en caso de fors
    //TODO no llega al limite superior
    for (i in 0 until 10 step 1) {
        if (i % 2 != 0) continue
        if (i == 8) break
        println(i)
    }
    println("------")
    //TODO no llega al limite superior tambien
    for (i in 10 downTo 0) {
        if (i % 2 == 0) continue
        println(i)
    }
}