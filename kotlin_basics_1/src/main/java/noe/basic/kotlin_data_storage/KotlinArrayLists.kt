package noe.basic.kotlin_data_storage

fun main(){

    // arraylist are mutable from the get go, which means that the size can increase or decrease
    //also each element of an array has write/read capabilities
    //elements are ordered
    val numbers = ArrayList<Int>(5)
    for (n in 1 until 6 step 1){
        numbers.add(n)
    }
    var sumOfNumbers =0
    for(n in numbers){
        sumOfNumbers+=n
    }
    println("average of the array numbers is: ${sumOfNumbers/numbers.size}")
}
