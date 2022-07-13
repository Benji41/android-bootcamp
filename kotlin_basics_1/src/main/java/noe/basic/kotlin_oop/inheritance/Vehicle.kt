package noe.basic.kotlin_oop.inheritance
//la keyword open describe que esta clase esta abierta a ser heredada
open class Vehicle (tireNumber :Int?, medium :String, energySource:String, autonomy : Float=0.0F, seat:Int?, weight:Float, capacity:Float){
    open var dueño :String = "yo"
    var tireNumber :Int?
    var medium :String=""
    var energySource :String=""
    var autonomy : Float = 0.0F
    var seatsNumber :Int?
    var weight :Float
    var capacity :Float
    init {
        this.tireNumber = tireNumber
        this.medium = medium
        this.energySource= energySource
        this.autonomy = autonomy
        this.seatsNumber = seat
        this.weight = weight
        this.capacity = capacity
    }
   open fun drive():String{
       println("fium")
       return ""
   }
   open fun fillEnergy():String{
       println("La energia se transforma")
       return ""
   }

    open override fun toString(): String {
        return "Vehicle(dueño='$dueño', tireNumber=$tireNumber, medium='$medium', energySource='$energySource', autonomy=$autonomy, seatsNumber=$seatsNumber, weight=$weight, capacity=$capacity)"
    }

}