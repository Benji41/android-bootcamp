package noe.basic.kotlin_basics_1.KotlinNullHandling

fun main(){
    //elvis operator
    //what if we have a variable and we need to assign the value of a nullable variable, use elvis op to assign a default instead of a null value
    var consumedData :String? = null
    val nameFromAPI = consumedData ?: "Ningun valor"
    //thats wassup
    println(nameFromAPI)


    //not null assertion operator
    //it converts a nullable variable into a non nullable variable
    consumedData= "NOE BENJAMIN REYNOSO AGUIRRE"
    val nameFromAPI2 = consumedData!!
    println(nameFromAPI2)
    consumedData = null
    //have to be sure the nullable variable is not storing a null value, otherwise the app will broke
    //exp
    val nameFromAPI3 = consumedData!!
    println(nameFromAPI3)
}