package noe.basic.kotlin_basics_1

fun main(){
    val myState = "Sonora"
    if(myState.equals("veracru")){
        println("mariscos")
    }else if (myState.equals("cdmx")){
        println("refresco")
    }else if(myState.equals("guadalajara")){
        println("tequila")
    }else{
        println("tacos de carne asada")
    }
    //type free
    // por inferencia la variable es integer
    var i=11;
    //es falso, es 5.5
    //el resultado de la operacion se castea a integer
    i/=2
    println(i)
    if(i.toString().equals("5")) println(i)

    //mejor manera, asi debe de ser, operacion por afuera
    i/=2
    if(i.equals(5.0)){
        println("comportamiento no esperado")
    }
    i.compareTo(5)
    //solucion
    var j :Float =11F
    if(j/2==5.0F){
        print("comportamiento no esperado de nuevo")
    }


}