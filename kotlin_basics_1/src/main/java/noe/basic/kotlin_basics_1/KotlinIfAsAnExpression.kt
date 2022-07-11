package noe.basic.kotlin_basics_1

fun main(){
    val myFavouriteNumber = 41
    val describeMyFavouriteNumber = if (myFavouriteNumber == 1){
        print("first if statement")
        "Mi numero favorito es el numero uno"
    }else if(myFavouriteNumber == 10){
        print("second if statement")
        "Mi numero favorito es el numero diez"
    }else if (myFavouriteNumber == 41){
        println("third if statement")
        "el numero mas chingon de la historia el 41"
    }else{
        "No esta tan curado tu numero"
    }

    print(describeMyFavouriteNumber)
}