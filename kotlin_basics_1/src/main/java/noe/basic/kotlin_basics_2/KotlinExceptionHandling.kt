package noe.basic.kotlin_basics_2

fun main() {

}

fun method1() {

    try {
        //code that can have a runtime exception
    } catch (e: Exception) {

        //get the error which cause the exception
        //do something with it
        throw e
        // throw is a tool for testing, not recommended in production, allows u to break the program

        //theres compile time exception and run time exceptions
    } catch (t: Throwable) {
        //you can have multiple catch blocks to handle different types of exceptions
    } finally {
        //if an exception was thrown or not it will run  this code

    }
}