package org.example

fun main(){

    val travelTimeMinutes = 457
    val departureHour = 9
    val departureMin = 39
    val minPerHour = 60

    var arrivalHour = travelTimeMinutes / 60 + departureHour
    var arrivalMin = travelTimeMinutes % 60 + departureMin

    if (arrivalMin > minPerHour){
        arrivalHour++
        arrivalMin = arrivalMin - 60
    }

    println("$arrivalHour:$arrivalMin")

}