package noe.basic.kotlin_oop.abstractClasses

class Bicycle(
    numberSeats: Int, capacity: Float?, weight: Float, tireNumber: Int,
    override var typeFuel: String
) : Vehicle(numberSeats, capacity, weight, tireNumber) {
    override fun drive(): String {
        return "con manubrio"
    }

    override fun charge(): String {

        return this.typeFuel
    }

    override fun toString(): String {
        capacity?.let { return "Bicycle(typeFuel='$typeFuel',$capacity,$numberSeats,$weight,$tireNumber)" }
        return "Bicycle(typeFuel='$typeFuel',$numberSeats,$weight,$tireNumber)"
    }

}