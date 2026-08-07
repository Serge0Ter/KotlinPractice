package org.example.lesson12

class Weather2(
    var dayTemp: Int,
    var nightTemp: Int,
    var isCloudy: Boolean,
) {

    fun printInfo() {
        println("Днем: $dayTemp Вечеров: $nightTemp Дождь: $isCloudy")
    }

}

fun main() {

    val friday = Weather2(27, 22, false)
    val sunday = Weather2(29, 25, false)
    friday.printInfo()
    sunday.printInfo()
}