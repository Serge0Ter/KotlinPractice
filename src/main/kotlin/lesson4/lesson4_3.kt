package org.example.lesson4

const val AIR_HUMIDITY = 20
const val SEASON = "зима"

fun main() {

    val isSunny = true
    val isOpenTent = true
    val airHumidity = 20
    val season = "зима"

    val result = (isSunny && isOpenTent && (airHumidity == AIR_HUMIDITY) && (season != SEASON))

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}