package noe.basic.kotlin_oop

fun main(){
    var cellPhone = mobilePhone("Android","Samsung","Galaxy S20 Ultra")
}

class mobilePhone(osName:String,brand:String,model :String){
    init{
        println("OS name: $osName, brand: $brand, model: $model")
    }
}