package org.example.lesson12

class Weather {
    var dayTemp: Int = 0
    var nightTemp: Int = 0
    var isCloudy: Boolean = false

    fun printInfo() {
        println("Днем: ${dayTemp} Вечеров: ${nightTemp} Дождь: $isCloudy")
    }

}

fun main() {

    val friday = Weather().apply { dayTemp = 27; nightTemp = 22; isCloudy = false }
    val sunday = Weather().apply { dayTemp = 29; nightTemp = 25; isCloudy = false }
    friday.printInfo()
    sunday.printInfo()
}