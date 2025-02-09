package org.example

const val ALL_TABLE = 13

fun main () {

    val tableToday = 13
    val tableTomorrow = 9

    val isAvailableToday = tableToday < ALL_TABLE
    val isAvailableTomorrow = tableTomorrow < ALL_TABLE


    println("Доступность столов сегодня: $isAvailableToday \nДоступность столов завтра: $isAvailableTomorrow")
}