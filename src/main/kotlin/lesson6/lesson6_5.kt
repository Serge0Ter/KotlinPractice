package org.example.lesson6

fun main() {

    var attempt = 0

    println("Что бы пройти авторизацию, докажите что вы не бот.")
    while (attempt < 3) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        print(" Решите пример: $number1 + $number2 = ")
        val sum = readln().toIntOrNull() ?: 0
        when (sum) {
            0 -> {
                println("Некорректное значение")
                attempt++
            }

            number1 + number2 -> {
                println("Добро пожаловать!")
                return
            }
            else -> {
                println("Ответ неверный")
                attempt++
            }
        }
    }
    println("Доступ запрещен")
}