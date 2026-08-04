package org.example.lesson10

const val LOGIN = "admin"
const val PASSWORD = "12345"

fun main() {

    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()
    showProduct(isAuth(login, password))

}

fun isAuth(login: String, password: String): String? {
    val result = if (login == LOGIN && password == PASSWORD) {
        val char = "ABCDEFabcdef0123456789"
        (1..32).map { char.random() }.joinToString("")
    } else null
    return result
}

fun showProduct(auth: String?) {
    val listProducts = listOf("Морковь", "Лук", "Картофель")
    if (auth == null) println("Неверный логин или пароль") else println(listProducts)
}