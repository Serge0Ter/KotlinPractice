package org.example.lesson5

import java.time.Year

const val AGE_OF_MAJORITY = 18
private val YEAR = Year.now().value

fun main() {

    print("Введите год своего рождения: ")
    val userYear = readln().toIntOrNull() ?: 0
    val result = YEAR - userYear
    when (result) {
        in 0..17 -> println("Доступ запрещен")
        in 18..100 -> println("Показать экран со скрытым контентом")
        else -> println("Ошибка...")
    }
}