package org.example.lesson6

fun main() {

    val numberForWins = (1..9).random()
    var attempt = 5
    while (attempt > 0) {
        print("Введи число от 1 до 9: ")
        val userNumber = readln().toIntOrNull() ?: 0
        when (userNumber) {
            0 -> println("Неверное число или значение")

            numberForWins -> {
                println("Это была великолепная игра!")
                break
            }

            else -> println("Попробуй еще раз. У тебя осталось попыток: ${--attempt}")
        }
    }
    println("Вы проиграли. Загадано было число: $numberForWins")

}