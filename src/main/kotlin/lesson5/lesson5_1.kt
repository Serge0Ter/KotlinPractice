package org.example.lesson5

const val RESULT = 9
fun main() {

    print("Решите задачу: 6 + 3 = ")
    val result = readln().toIntOrNull() ?: 0
    if (result == RESULT) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}