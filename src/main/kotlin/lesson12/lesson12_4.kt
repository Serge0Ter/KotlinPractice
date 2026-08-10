package org.example.lesson12


class Weather4(day: Int, night: Int, cloudy: Boolean) {
    private val celsius = 273
    val dayTemp: Int = day - celsius
    val nightTemp: Int = night - celsius
    var isCloudy: Boolean = cloudy

    init {
        require(day >= 0) { "Температура $day ниже нуля" }
        require(night >= 0) { "Температура $night ниже нуля" }
        println("Днем: $dayTemp C Вечеров: $nightTemp C Дождь: $isCloudy")
    }
}

fun main() {

    val friday = Weather4(100, 87, false)
    val sunday = Weather4(105, 92, true)
}