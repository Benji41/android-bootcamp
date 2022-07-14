package noe.basic.kotlin_oop.abstractClasses

class Car(numberSeats:Int, capacity:Float?, weight:Float, tireNumber:Int) :Vehicle(numberSeats,capacity,weight,tireNumber) {
    override var typeFuel: String ="Fuel"
    override fun drive(): String {
       return "con volante"
    }

    override fun charge(): String {
        return typeFuel
    }

    override fun toString(): String {
        capacity?.let{ return "Bicycle(typeFuel='$typeFuel',$capacity,$numberSeats,$weight,$tireNumber)"}
        return "Bicycle(typeFuel='$typeFuel',$numberSeats,$weight,$tireNumber)"
    }


}