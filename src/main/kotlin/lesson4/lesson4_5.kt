package org.example.lesson4

private const val SHIP_IS_DAMAGED = true
private val CREW_COUNT = 50..70
private const val PROVISIONS = 50
private const val WEATHER_IS_GOOD = true

fun main() {
    print("The ship is damaged?: ")
    val isDamage = readln().toBoolean()
    print("How many crew are on board?: ")
    val crewCount = readln().toInt()
    print("How many boxes of food?: ")
    val foodCount = readln().toInt()
    print("The weather is good?: ")
    val weatherIsGood = readln().toBoolean()

    (((isDamage != SHIP_IS_DAMAGED) && (crewCount in CREW_COUNT) && (foodCount > PROVISIONS)) ||
            ((crewCount == CREW_COUNT.last) && (weatherIsGood == WEATHER_IS_GOOD) && (foodCount > PROVISIONS))).also {
        println("Can the ship set sail? $it")
    }
}