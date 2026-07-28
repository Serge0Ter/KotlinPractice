package org.example.lesson6

fun main() {

    println("РЕГИСТРАЦИЯ")
    print("Введите имя для регистрации пользователя: ")
    val userName = readln()
    print("Введите пароль: ")
    val userPassword = readln()

    val users = mapOf<String, String>(userName to userPassword)
    while (true) {
        print("Введите имя пользователя: ")
        val userNameAuth = readln()
        print("Введите пароль: ")
        val userPasswordAuth = readln()
        if (users.contains(userNameAuth) && users.containsValue(userPasswordAuth)) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Введи еще раз")
        }
    }
}