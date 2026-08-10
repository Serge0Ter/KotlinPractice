package org.example.lesson12

class Weather3(day: Int, night: Int) {
    private val celsius = 273
    var dayTemp: Int = day - celsius
    var nightTemp: Int = night - celsius
    var isCloudy: Boolean = false

    init {
        require(day > 0)
        require(night > 0)
    }

    fun printInfo() {
        println("Днем: $dayTemp C Вечеров: $nightTemp C Дождь: $isCloudy")
    }

}

fun main() {

    val friday = Weather3(100, 87)
    val sunday = Weather3(105, 92).apply {
        isCloudy = true
    }
    friday.printInfo()
    sunday.printInfo()
}