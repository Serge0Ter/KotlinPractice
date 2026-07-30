package org.example.lesson7

fun main() {

    print("Сколько секунд надо засечь: ")
    val seconds = readln().toIntOrNull() ?: -1
    when (seconds > 0) {
        true -> {
            for (i in seconds downTo 1) {
                println("Осталось: $i секунд")
                Thread.sleep(1000)
            }
            println("Время вышло")
        }

        false -> {
            println("Некорректное значение")
        }
    }
}