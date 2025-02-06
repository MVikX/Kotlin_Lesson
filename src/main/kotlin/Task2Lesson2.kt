package org.example

fun main() {
    val worker = IntRange(0, 49).toList()
    val intern = IntRange(0, 29).toList()
    val payWorker = 30000
    val payIntern = 20000

    val allPayWorker = worker.size * payWorker
    val allPayInternWorker = allPayWorker + intern.size * payIntern
    val averagePay = allPayInternWorker / (worker.size + intern.size)

    println("Расходы на выплату зарплаты постоянных сотрудников: $allPayWorker")
    println("Общие расходы по ЗП после прихода стажеров: $allPayInternWorker")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averagePay")
}

