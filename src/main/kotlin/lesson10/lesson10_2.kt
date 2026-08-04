package org.example.lesson10

fun main() {
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()
    if (isValid(login, password)) println("Добро пожаловать") else println("Логин или пароль недостаточно длинные")
}

fun isValid(login: String, password: String): Boolean = login.length >= 4 && password.length >= 4