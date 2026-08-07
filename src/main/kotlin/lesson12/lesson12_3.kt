package org.example.lesson12

class Weather3(
    var dayTemp: Int,
    var nightTemp: Int,
    var isCloudy: Boolean,
) {
    private val celsius = 273
    fun printInfo() {
        println("Днем: ${dayTemp - celsius} Вечеров: ${nightTemp - celsius} Дождь: $isCloudy")
    }

}

fun main() {

    val friday = Weather3(100, 87, false)
    val sunday = Weather3(105, 92, false)
    friday.printInfo()
    sunday.printInfo()
}