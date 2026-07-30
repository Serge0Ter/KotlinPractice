package org.example.lesson7

fun main() {

    while (true) {
        val numbers = 1000..9999
        val authCode = numbers.random()
        println("Ваш код авторизации: $authCode")
        print("Введи код авторизации: ")
        val code = readln().toIntOrNull() ?: 0
        if (code == authCode) {
            println("Добро пожаловать")
            return
        } else continue
    }
}
