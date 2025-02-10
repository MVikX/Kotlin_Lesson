package org.example

fun main() {

    val e = "E"
    val d = "D"
    var from = 2
    var to = 4
    var numeberGo = 1

    var allGo = "$e$from - $d$to; $numeberGo"
    println(allGo)

    from = 2
    to = 2
    to++
    numeberGo++

    allGo = "$d$from - $d$to; $numeberGo"
    println(allGo)

}