package org.example.lesson16

class User(val login: String, initialPassword: String) {
    private val password = initialPassword

    fun auth(password: String) {
        if (password == this.password) println("Пароль введен корректно")
        else println("Пароль некорректен")
    }
}

fun main() {

    User("Ser", "321").auth("321")

}