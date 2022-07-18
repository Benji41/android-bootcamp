package noe.basic.kotlin_basics_1.Kotlin_typecasting

fun main() {
    var myName: Any? = "Noe Benjamin Reynoso"
    var myNameAsAString: String? = myName as String

    myNameAsAString?.let { println("$myNameAsAString length: ${myNameAsAString!!.length}") }
    myNameAsAString = null
    myNameAsAString?.let { println("$myNameAsAString length: ${myNameAsAString.length}") }

}