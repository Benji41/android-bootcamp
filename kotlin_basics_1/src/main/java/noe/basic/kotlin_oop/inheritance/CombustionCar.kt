package noe.basic.kotlin_oop.inheritance

class CombustionCar(
    tireNumber: Int?,
    autonomy: Float = 0.0F,
    seat: Int?,
    weight: Float,
    capacity: Float,
    brand: String,
    quality: String,
    typeFuel: String,
    transmision: String,
    override var maxSpeed: Float
) : Car(
    tireNumber,
    "fuel",
    autonomy,
    seat,
    weight,
    capacity,
    brand,
    quality,
    transmision,
    maxSpeed
) {
    override var dueño: String = ""
    var typeFuel: String

    init {
        this.typeFuel = typeFuel
        this.dueño = "Benjamin"
    }

    override fun drive(): String {
        return "con el volante"
    }

    override fun charge(): String {
        return "yendo por gota"
    }

    override fun toString(): String {
        return "CombustionCar(maxSpeed=$maxSpeed, dueño='$dueño', typeFuel='$typeFuel', tire number= ${this.tireNumber} autonomy=${this.autonomy} seat=$seatsNumber weight= $weight , capacity=$capacity, brand= $brand, quality=$quality)"
    }
}