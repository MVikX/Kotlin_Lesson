package org.example

const val firstName = "Татьяна"
const val middleName = "Сергеевна"

fun main() {

    var lastName = "Андреева"
    var age = 20
    var fullName = "$lastName $firstName $middleName"

    println("$fullName $age")

    age = 22
    lastName = "Сидорова"
    fullName = "$lastName $firstName $middleName"
    println("$fullName $age")

}