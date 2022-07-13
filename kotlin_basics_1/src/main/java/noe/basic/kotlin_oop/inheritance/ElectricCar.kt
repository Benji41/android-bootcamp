package noe.basic.kotlin_oop.inheritance

class ElectricCar(tireNumber :Int?, autonomy : Float=0.0F, seat:Int?, weight:Float, capacity:Float,brand:String,quality :String,battery:Float,transmision:String):
    Car(tireNumber,"electric charge",autonomy,seat,weight,capacity,brand,quality,transmision) {
    var battery:Float
    override var dueño: String = ""
        set(value) {
            field = value
        }
    init {
        this.battery = battery
        this.dueño = "Noe"
    }

    override fun drive(): String {
        return "me duermo xd"
    }

    override fun fillEnergy(): String {
        return "lo conecto al enchufe de mi casa"
    }

    override fun toString(): String {
        return super.toString()+"ElectricCar(battery=$battery, dueño='$dueño')"
    }
}