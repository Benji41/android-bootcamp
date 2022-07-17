package noe.basic.kotlin_data_storage

fun main(){
    //both types of sets only store read only values
    //immutable
    //sets collections, eliminates duplicate data and are not sorted alphabetically
    //can store nulls but the method toSortedSet wont work
    val fruits = setOf<String>("Apple","Banana","Pear","Watermelon","Grape","Grape","Apple")
    //unsorted
    for (fruit in fruits){
        println(fruit)
    }
    //sorted
    println(fruits.toSortedSet())

    //mutable
    val mutableFruitSet = mutableSetOf<String>("Apple","Banana","Pear","Watermelon","Grape","Grape","Apple")
    mutableFruitSet.add("Mango")
    //only returns a value and its not writeable
    mutableFruitSet.elementAt(4)
    for (fruit in mutableFruitSet.toSortedSet()){
        println(fruit)
    }
    //convert set to list
    val listOfFruits = mutableFruitSet.toSortedSet().toMutableList()
    println("----- list -----")
    for (fruit in listOfFruits){
        println(fruit)
    }
}