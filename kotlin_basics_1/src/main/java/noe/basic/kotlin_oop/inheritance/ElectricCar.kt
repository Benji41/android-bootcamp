package noe.basic.kotlin_oop.inheritance

class ElectricCar(
    tireNumber: Int?,
    autonomy: Float = 0.0F,
    seat: Int?,
    weight: Float,
    capacity: Float,
    brand: String,
    quality: String,
    battery: Float,
    transmision: String,
    override var maxSpeed: Float
) :
    Car(
        tireNumber,
        "electric charge",
        autonomy,
        seat,
        weight,
        capacity,
        brand,
        quality,
        transmision,
        maxSpeed
    ) {
    var battery: Float
    override var dueño: String = ""

    init {
        this.battery = battery
        this.dueño = "Noe"
    }

    override fun drive(): String {
        return "es tesla se mueve solo"
    }

    override fun charge(): String {
        return "echandole pura cfe"
    }

    override fun toString(): String {
        return "ElectricCar(maxSpeed=$maxSpeed, battery=$battery, dueño='$dueño', tire number= ${this.tireNumber} autonomy=${this.autonomy} seat=$seatsNumber weight= $weight , capacity=$capacity, brand= $brand, quality=$quality)"
    }

}