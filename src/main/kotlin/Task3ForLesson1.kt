package org.example

const val minInHour = 60

fun main(){

    val travelTimeMinutes = 457
    val departureHour = 9
    val departureMin = 39

    val arrivalHour = (travelTimeMinutes + departureHour * minInHour + departureMin) / minInHour
    val arrivalMin = (travelTimeMinutes + departureHour * minInHour + departureMin) % minInHour

    println("$arrivalHour:$arrivalMin")

}