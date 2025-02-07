package org.example

fun main() {
    val morningHi = "Доброе утро,"
    val evningHi = "Добрый вечер,"
    val userName = "User"
    val morningTime = 12
    val evningTime = 18
    var timeNow = 10

    var greeting = if (timeNow < morningTime) {
        morningHi
    } else {
        evningHi
    }
    println("$greeting $userName")


    timeNow = 20
    greeting = if (timeNow >= evningTime) {
        evningHi
    } else {
        morningHi
    }
    println("$greeting $userName")

}