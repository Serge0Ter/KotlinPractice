package org.example.lesson6

fun main() {

    print("Введи количество секунд: ")
    val userSeconds = readln().toIntOrNull() ?: 0
    var seconds = userSeconds
    while (seconds > 0) {
        Thread.sleep(1000)
        seconds--
    }
    println("Прошло $userSeconds секунд")
}