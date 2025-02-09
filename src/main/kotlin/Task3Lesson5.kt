package org.example

const val WINNING_NUMBER_ONE: Byte = 10
const val WINNING_NUMBER_TWO: Byte = 20

fun main() {
    val minNumber:Byte = 0
    val maxNumber:Byte = 42

    while (true) {
        println("Введите два числа от $minNumber до $maxNumber.")
        val firstUserNumber = readln().toByte()
        val secondUserNumber = readln().toByte()

        if (firstUserNumber < minNumber || firstUserNumber > maxNumber || secondUserNumber < minNumber || secondUserNumber > maxNumber) {
            println("Числа должны быть от $minNumber до $maxNumber. Попробуйте снова.")
            continue
        }


        if ((firstUserNumber == WINNING_NUMBER_ONE && secondUserNumber == WINNING_NUMBER_TWO) || (firstUserNumber == WINNING_NUMBER_TWO && secondUserNumber == WINNING_NUMBER_ONE)) {
            println("Поздравляем! Вы выиграли главный приз!")
            break
        } else if (firstUserNumber == WINNING_NUMBER_ONE || secondUserNumber == WINNING_NUMBER_ONE || firstUserNumber == WINNING_NUMBER_TWO || secondUserNumber == WINNING_NUMBER_TWO) {
            println("Вы выиграли утешительный приз!")
            break
        } else {
            println("Неудача!")
            break
        }

    }
}