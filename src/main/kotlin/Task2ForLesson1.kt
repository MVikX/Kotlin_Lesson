package org.example

fun main () {

    val numberOfOrders:Byte = 75
    val thankYouMessage:String = "Thank you for buying!"
    var teamSize:Int = 2000

    println("Your order queue: $numberOfOrders")
    println(thankYouMessage)
    // println("Общее колличество работников: $teamSize")

    teamSize --

    println("Общее колличество работников: $teamSize")
}