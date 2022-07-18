package noe.basic.kotlin_oop

fun main() {
    var persona = properPerson()
    println(persona.toString())
    var persona2 = properPerson("Noe", "Reynoso", 23, "conducir", "aqui mero")
    println(persona2.toString())
}

//TODO lateinit, access modifiers, getter and setter
class properPerson(
    firstName: String = "ningun nombre",
    lastName: String = "ningun apellido",
    age: Int = -1
) {
    private var firstName: String
    private var lastName: String
    private var age: Int = -1
    private var hobby: String? = null
    private var job: String? = null

    init {
        //el set es permitido porque funciona dentro de la clase
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    //secondary constructor
    constructor(
        firstName: String,
        lastName: String,
        age: Int,
        hobby: String = "nigun hobby",
        job: String = "sin jale"
    ) : this(firstName, lastName, age) {
        //el set es permitido porque funciona dentro de la clase
        this.hobby = hobby
        this.job = job
    }

    //create custom getter and setter, aplica si no tiene lateinit y si no tiene el modificador de acceso privado
    var country: String = "Mexico"
        get() = field.lowercase()
        set(value) {
            field = "$value$"
        }

    override fun toString(): String {
        return "properPerson(firstName='$firstName', lastName='$lastName', age=$age, hobby='${hobby.let { this.hobby }}', job='${job.let { this.job }}', country='$country')"
    }
}