package org.example.lesson10

fun main() {
    val login = "admin"
    val password = "admin"
    val verify = verifyCredentials(login, password)
    if (verify == null) println("Неверный логин или пароль") else println(showProduct(verify))


}

fun verifyCredentials(login: String, password: String): String? {
    val result = if (login == "admin" && password == "admin") {
        val char = "ABCDEFabcdef0123456789"
        (1..32).map { char.random() }.joinToString("")
    } else null
    return result
}

fun showProduct(auth: String) = listOf("Морковь", "Лук", "Картофель")