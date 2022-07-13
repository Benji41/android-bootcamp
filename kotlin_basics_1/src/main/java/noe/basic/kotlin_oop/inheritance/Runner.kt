package noe.basic.kotlin_oop.inheritance

fun main(){
    var carro = CombustionCar(4,123.1F,4,1000F,500F,"Mazda","Deluxe","Regular","Estandar")
    var carro2 =ElectricCar(4,100.1F,4,1500F,200F,"Tesla","Deluxe",300F,"automatic")
   var carros = arrayOf(carro,carro2)
    if (carros != null) {
        for(obj in carros){
            println(obj.toString())
            println("lo recargo: ${obj.fillEnergy()}")
            println("lo manejo: ${obj.drive()}")
        }
    }
}