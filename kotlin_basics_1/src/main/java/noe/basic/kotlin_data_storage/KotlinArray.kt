package noe.basic.kotlin_data_storage

data class Person(val name:String,var age:Int, var job:String?)
fun main(){
    //MUTABLE no more elements can be added, but there values can be changed thus being mutable
    //the most described approach
    val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
    numbers[0] = 2
    //type inference
    val numbers2 = intArrayOf(1,2,3,4,5,6)
    //type inference at is fullest
    val numbers3 = arrayOf(1,2,3,4,5,6)
    //reference in memory
    println("$numbers $numbers2 $numbers3")

    //display values of arrays with contentToString method
    println("${numbers.contentToString()} ${numbers2.contentToString()} ${numbers3.contentToString()}")

    //print each value
    for (element in numbers){
        println(element)
    }

    //create an array of the size of six elements
    val numbers4 =IntArray(6)
    //create an array of the size of six elements and a default value for each element
    val numbers5 =IntArray(6) { 41 }

    println("${numbers5.contentToString()}")
    //lambda soon to study, but it means the index of each element
    //then element i will store a value of i*i
    val arr = IntArray(5) { i->(i*i) }
    arr[0]=41
    println(arr.contentToString())

    //mix of datatypes stored
    val person = Person("Noe",23,null)
    person.job = person.job ?: "Buscando"
    //name is a immutable property so it cant be reassigned
    //person.name = "noe"
    val person2 = Person("Benjamin",23,"mobile dev")
    //in the other hand age can be reassigned
    person2.age+=1
    //both Person instances can be val because there not reassigned with another whole instance of Person
    val consumedAPIData = arrayOf(person,person2,41,"flights booked")
    println("${consumedAPIData.contentToString()}")
}