package org.example

import java.time.LocalDate

const val ADULT_AGE = 18

fun main() {
    val currentYear = LocalDate.now().year

    println("Введите свой год рождения:")
    val birthYear = readln().toInt()

    if (currentYear - birthYear >= ADULT_AGE) {
        println("Показать экран со скрытым контентом.")
    } else {
        println("Вернутся в главное меню.")
    }

}