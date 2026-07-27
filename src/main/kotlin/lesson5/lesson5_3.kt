package org.example.lesson5

const val WIN_NUMBER_1 = 12
const val WIN_NUMBER_2 = 37

fun main() {

    print("Введите первое число: ")
    val number1 = readln().toIntOrNull() ?: 0
    print("Введите второе число: ")
    val number2 = readln().toIntOrNull() ?: 0

    val set = setOf(number1, number2)
    val win = setOf(WIN_NUMBER_2, WIN_NUMBER_1)

    when {
        set == win -> println("Поздравляем! Вы выиграли главный приз!")
        WIN_NUMBER_1 in set || WIN_NUMBER_2 in set -> println("Вы выиграли утешительный приз!")
        WIN_NUMBER_1 !in set || WIN_NUMBER_2 !in set -> println("Неудача!")
    }
    println("Нужные числа для победы: $WIN_NUMBER_1 и $WIN_NUMBER_2")
}