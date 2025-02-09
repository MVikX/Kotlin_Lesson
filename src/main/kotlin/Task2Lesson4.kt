package org.example

const val MIN_MASS = 35
const val MAX_MASS = 100
const val MAX_LITRE = 100

fun main() {

    val cargo1Weight = 20
    val cargo1Litre = 80
    val cargo2Weight = 50
    val cargo2Litre = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Litre л соответствует категории 'Average': " + (MIN_MASS < cargo1Weight && cargo1Weight <= MAX_MASS && cargo1Litre < MAX_LITRE))
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Litre л соответствует категории 'Average': " + (MIN_MASS < cargo2Weight && cargo2Weight <= MAX_MASS && cargo2Litre < MAX_LITRE))

}