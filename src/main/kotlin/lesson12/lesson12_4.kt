package org.example.lesson12


class Weather4(day: Int, night: Int) {
    private val celsius = 273
    val dayTemp: Int = day - celsius
    val nightTemp: Int = night - celsius
    var isCloudy: Boolean = false

    init {
        require(day > 0) { "Температура $day ниже нуля" }
        require(night > 0) { "Температура $night ниже нуля" }
        println("Днем: $dayTemp C Вечеров: $nightTemp C Дождь: $isCloudy")
    }
}

fun main() {

    val friday = Weather4(100, 87)
    val sunday = Weather4(105, 92).apply {
        isCloudy = true
    }
}