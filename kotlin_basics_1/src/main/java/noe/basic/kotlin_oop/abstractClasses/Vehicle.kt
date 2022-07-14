package noe.basic.kotlin_oop.abstractClasses

import noe.basic.kotlin_oop.inheritance.Functions

abstract  class Vehicle(numberSeats:Int,capacity:Float?,weight:Float,tireNumber:Int){
    var numberSeats:Int
    var capacity :Float?
    var weight :Float
    val tireNumber :Int
    init {
        this.numberSeats=numberSeats
        this.capacity = capacity
        this.weight = weight
        this.tireNumber = tireNumber
    }

    //abstract property
    abstract var typeFuel :String
    //abstract methods
    abstract fun drive():String
    abstract fun charge():String



}