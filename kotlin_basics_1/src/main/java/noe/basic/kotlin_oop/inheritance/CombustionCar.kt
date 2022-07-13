package noe.basic.kotlin_oop.inheritance

class CombustionCar(tireNumber :Int?, autonomy : Float=0.0F, seat:Int?, weight:Float, capacity:Float,brand:String,quality :String,typeFuel:String,transmision:String)
    : Car(tireNumber,"fuel",autonomy,seat,weight,capacity,brand,quality,transmision){
    override var dueño: String=""
        set(value) {
            field = value
        }
    var typeFuel :String
    init {
        this.typeFuel = typeFuel
        this.dueño ="Benjamin"
    }

    override fun drive(): String {
        return "manejo con volante"
    }

    override fun fillEnergy(): String {
        return "voy por gota"
    }


    override fun toString(): String {
        return super.toString()+ "CombustionCar(dueño='$dueño', typeFuel='$typeFuel')"
    }
}