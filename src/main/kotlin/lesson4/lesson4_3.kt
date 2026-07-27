package org.example.lesson4

const val AIR_HUMIDITY = 20
const val SEASON = "зимма"

fun main() {

    val isSunny = true
    val isOpenTent = true
    val airHumidity = 20
    val season = "зимма"

    val result = ((isSunny == true) && (isOpenTent == true) && (airHumidity == AIR_HUMIDITY) && (season != SEASON))

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}