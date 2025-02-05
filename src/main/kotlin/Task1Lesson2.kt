package org.example

fun main() {
    val student: Byte = 4
    val evaluations = listOf(3,4,3,5)
    var averageScore: Float = 0.0f

    averageScore = evaluations.sum() / student.toFloat()

    println("Average score: %.2f".format(averageScore))
}

