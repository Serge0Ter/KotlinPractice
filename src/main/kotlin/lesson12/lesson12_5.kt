package org.example.lesson12

class Weather5(day: Int, night: Int, cloudy: Boolean) {
    private val celsius = 273
    val dayTemp: Int = day - celsius
    val nightTemp: Int = night - celsius
    val isCloudy: Boolean = cloudy

    init {
        require(day >= 0) { "Температура $day ниже нуля" }
        require(night >= 0) { "Температура $night ниже нуля" }
    }
}

fun main() {

    val list = mutableListOf<Weather5>()

    repeat(30) {
        list.add(
            Weather5(
                day = (0..100).random(),
                night = (0..100).random(),
                cloudy = listOf(true, false).random(),
            )
        )
    }
    val day = list.map {
        it.dayTemp
    }.average()
    val night = list.map {
        it.nightTemp
    }.average()
    val rainfall = list.map {
        it.isCloudy
    }.filter { it == true }.size
    println(day)
    println(night)
    println(rainfall)

}