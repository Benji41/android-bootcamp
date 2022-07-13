package noe.basic.kotlin_oop.inheritance

open class Car(tireNumber :Int?, energySource:String, autonomy : Float=0.0F, seat:Int?, weight:Float, capacity:Float,brand:String,quality :String,transmision :String) : Vehicle(tireNumber, "Road", energySource, autonomy, seat, weight, capacity) {
    var quality:String
    var brand:String
    var transmision :String
    init {
        this.brand = brand
        this.quality = quality
        this.transmision = transmision
    }

  open override fun toString(): String {
        return super.toString() +"Car(quality='$quality', brand='$brand', transmision='$transmision')"
    }


}