package org.example.lesson10

const val LOGIN = "admin"
const val PASSWORD = "12345"

fun main() {
    val verify = verifyCredentials(LOGIN, PASSWORD)
    if (verify == null) println("Неверный логин или пароль") else println(showProduct(verify))

}

fun verifyCredentials(login: String, password: String): String? {
    val result = if (login == LOGIN && password == PASSWORD) {
        val char = "ABCDEFabcdef0123456789"
        (1..32).map { char.random() }.joinToString("")
    } else null
    return result
}

fun showProduct(auth: String): List<String> = listOf("Морковь", "Лук", "Картофель")