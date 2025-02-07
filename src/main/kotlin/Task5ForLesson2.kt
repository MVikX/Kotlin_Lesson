package org.example

import kotlin.math.pow

const val percentDivisor = 100

fun main() {

    val deposit = 70000
    val annualInterestRate = 16.7
    val years = 20

    val yearFraction = annualInterestRate / percentDivisor
    val finalAmount = deposit * (1 + yearFraction).pow(years)

    println("%.3f".format(finalAmount))
}