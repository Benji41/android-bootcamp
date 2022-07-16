package noe.basic.kotlin_basics_1.KotlinNullHandling

fun main(){
    var name :String = "Noe"
    name +=" Benjamin"
    /*null cant be a value of a non-null type String
    * name = null
    * */
    var nullableName :String? ="Noe"
    nullableName = null

    var lengthOfName = name.length
    //if theres no value assigned, it returns a null value
    var lengthOfNullableName = nullableName?.length
    println("$lengthOfNullableName $lengthOfName")


    //a case if we need a nullable value, but be sure that the value isnt null
    var consumedDataExample : String?=null
    var lengthOfNullableData :Int =0
    //run the following code if the value of the nullable variable isnt null
    consumedDataExample?.let { lengthOfNullableData= consumedDataExample.length}
    println("$lengthOfNullableData")



}