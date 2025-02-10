package org.example

fun main() {
    var seconds: Short = 6480
    var hours: Byte = 0
    var minutes: Byte = 0

    hours = ((seconds / 60) / 60).toByte()
    minutes = (((seconds / 60) % 60)).toByte()
    seconds = ((seconds % 60).toByte().toShort())

    println("$hours:$minutes:$seconds")
}