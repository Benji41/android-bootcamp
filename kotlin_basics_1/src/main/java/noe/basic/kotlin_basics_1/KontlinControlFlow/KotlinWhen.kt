package noe.basic.kotlin_basics_1

fun main() {
    var myFavRestaurant = "koal sushi"
    when (myFavRestaurant) {
        "carls jr" -> {
            println("el mervinela come en el carlitos")
        }
        "rin rin pizza" -> {
            println("el mervinela come pizzas del rin rin")
        }
        "little cesar" -> {
            println("el mervinela come pizzas del liru ciza")
        }
        "koal sushi" -> {
            println("al mervino le gusta el koal sushi")
        }
    }

    //for numbers
    var mySeason = 5
    when (mySeason) {
        in 3..5 -> {
            println("primavera")
        }
        in 6..8 -> {
            println("verano")
        }
        // in for interval upTo
        in 9..11 -> {
            println("otonio")
        }
        //explicit numbers
        12, 1, 2 -> {
            println("invierno")
        }
        //default
        else -> {
            println("No existe ese mes")
        }
    }

    when (mySeason) {
        //12,11,10,9,8,7,6,5,4,3,2,1
        in 12 downTo 1 -> {
            println("ese mes existe")
        }
        else -> {
            println("No existe ese mes")
        }
    }

    //dynamic when for a given datatype
    var x: Any = 3.1416F
    when (x) {
        is Float -> {
            println("el datatype es float")
        }
        is String -> {
            println("el datatype es String")
        }
        //negacion de is
        !is Char -> {
            println("el datatype no es character")
        }
    }
}