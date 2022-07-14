package noe.basic.kotlin_oop.inheritance

//la keyword open describe que esta clase esta abierta a ser heredada
open class Vehicle(
    tireNumber: Int?,
    medium: String,
    energySource: String,
    autonomy: Float = 0.0F,
    seat: Int?,
    weight: Float,
    capacity: Float,
    override var maxSpeed: Float
) : Functions,Functions2 {
    open var dueño: String = "yo"
    var tireNumber: Int?
    var medium: String = ""
    var energySource: String = ""
    var autonomy: Float = 0.0F
    var seatsNumber: Int?
    var weight: Float
    var capacity: Float

    init {
        this.tireNumber = tireNumber
        this.medium = medium
        this.energySource = energySource
        this.autonomy = autonomy
        this.seatsNumber = seat
        this.weight = weight
        this.capacity = capacity
    }

    override fun charge(): String {
        return ""
    }

    override fun drive(): String {
        return "con las manoplas"
    }

   override fun drive(speed:Float): String {
       if(speed > this.maxSpeed) return "andas en freguisa morro"
       return ""
    }

}