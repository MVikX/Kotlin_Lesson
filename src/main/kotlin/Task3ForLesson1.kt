package org.example

fun main() {

    val year:Int = 1961
    var hours:String = "09"
    var minutes:String = "07"

    println("Первый полет Юрия Гагарина состоялся в $year году")
    println("В $hours часов")
    println("И $minutes минут")

    hours = "10"
    minutes = "55"


    print("Посадка после первого полета состоялась: $hours:")
    print(minutes)
}