package org.example.lesson15

abstract class WeatherStationStats

class Temperature(val temp: Float) : WeatherStationStats() {
    fun temp() {
        println("Температура: $temp °C")
    }
}

class PrecipitationAmount(val amount: Float) : WeatherStationStats() {
    fun amount() {
        println("Количество осадков: $amount %")
    }
}

class WeatherServer {
    fun sendData(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> stats.temp()
            is PrecipitationAmount -> stats.amount()
        }
    }
}

fun main() {
    val temperature = Temperature(26f)
    val precipitationAmount = PrecipitationAmount(15f)
    val weatherServer = WeatherServer()
    weatherServer.sendData(temperature)
    weatherServer.sendData(precipitationAmount)
}