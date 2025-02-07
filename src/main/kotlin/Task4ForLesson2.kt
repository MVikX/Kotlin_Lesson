package org.example

fun main() {

    val crystal = 7
    val iron = 11
    val buffPercent  = 20
    val allPercent = 100

    val bonusCrystal = crystal * buffPercent / allPercent
    val bonusIron = iron * buffPercent / allPercent


    println("Кристаллы: $bonusCrystal. Железо: $bonusIron")
}