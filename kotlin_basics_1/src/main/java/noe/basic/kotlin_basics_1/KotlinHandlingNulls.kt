package noe.basic.kotlin_basics_1

fun main(){
                        //agregando el signo de interrogacion permite que la variable almacene valores nulos
    var mySaldo :String? = "300 pesos"
                    //para llamar algun metodo, atributo o propiedad de una variable que podria sostener un valor nulo
                    //el signo de interrogacion seguido del . permite evitar llamar el valor si es que es nulo y retorna null
    println(mySaldo?.length)

    mySaldo = null
    println(mySaldo?.length)
}