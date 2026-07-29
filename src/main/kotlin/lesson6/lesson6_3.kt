package org.example.lesson6

fun main() {

    print("Введи количество секунд: ")
    var userSeconds = readln().toIntOrNull() ?: 0

//    do {
//        println("Осталось секунд: ${userSeconds--}")
//        Thread.sleep(1000)
//    } while (userSeconds > 0)

    while (userSeconds > 0) {
        println("Осталось секунд: ${userSeconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}