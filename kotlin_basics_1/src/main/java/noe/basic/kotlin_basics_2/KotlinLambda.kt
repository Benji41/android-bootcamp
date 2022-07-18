package noe.basic.kotlin_basics_2

//this is a type of function which is not declared and pass immediately as an expression

fun main() {
    //name of the function
    // assign the body with :
    //specify your parameters with there respective type
    // after -> Assign a type of value which will return
    //initialize variables inside of the body for each parameter
    //lastly perform the operation
    //this is the more customizable way for creating a lambda exp.
    val sumNumbers: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sumNumbers(1, 2))
    //less customizable
    val sum = { a: Int, b: Int -> a + b }
    println(sum(3, 4))
}