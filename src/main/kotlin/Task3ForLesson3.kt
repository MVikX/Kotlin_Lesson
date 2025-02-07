package org.example

fun main() {
    val read = readln().toByte()
    val multipliers = (1..9).toList()
    var allMultipliers = ""

    for (multipliers in multipliers) {
        allMultipliers += "$read * $multipliers = ${read * multipliers}\n"
    }
    println(allMultipliers.trimIndent())
}