package org.example

import kotlin.random.Random


fun main() {

    val random = Random
    val firstNumber = random.nextInt(1, 10)
    val secondNumber = random.nextInt(1, 10)


    println("Сложите два числа: $firstNumber, $secondNumber")
    val userNumber = readln().toInt()

    if (userNumber == firstNumber + secondNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}