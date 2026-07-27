package org.example.lesson5

import java.time.Year

const val AGE_OF_MAJORITY = 18
private val currentYear = Year.now().value

fun main() {
    print("Введите год своего рождения: ")
    val userYear = readln().toIntOrNull() ?: 0
    val result = currentYear - userYear
    if (result >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
}