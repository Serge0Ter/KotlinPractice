package org.example.lesson5

const val WIN_NUMBER_1 = 12
const val WIN_NUMBER_2 = 37

fun main() {

    print("Введите первое число: ")
    val number1 = readln().toIntOrNull() ?: 0
    print("Введите второе число: ")
    val number2 = readln().toIntOrNull() ?: 0

    when {
        number2 == WIN_NUMBER_2 && number1 == WIN_NUMBER_1 -> println("Поздравляем! Вы выиграли главный приз!")
        number2 == WIN_NUMBER_2 || number1 == WIN_NUMBER_1 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }
    println("Нужные числа для победы: $WIN_NUMBER_1 и $WIN_NUMBER_2")
}