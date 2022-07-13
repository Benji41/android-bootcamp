package noe.basic.kotlin_oop

fun main(){
    var cellPhone = mobilePhone("Android","Samsung","Galaxy S20 Ultra",30)
    println(cellPhone.chargeBaterry(50))
}

class mobilePhone(osName:String,brand:String,model :String,baterry :Int=0){
    var baterry :Int = -1
        get() {return field}
        //es el mismo get y set en toda la clase
        set(value) {
            if(value >=0 && value <= 50 || this.baterry != -1){
                field =value
            }else{
                println("mucha pila we")
            }
        }
    init {
        this.baterry = (baterry)
    }
    fun chargeBaterry(charged :Int=0):String{
        if(this.baterry != -1){
            this.baterry=this.baterry+charged
            return "Baterry initially ${this.baterry-charged}, charged up to ${this.baterry}"
        }
        return "No se pudo cargar"
    }
}