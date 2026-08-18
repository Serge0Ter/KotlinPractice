package org.example.lesson16

class User(val login: String, initialPassword: String) {
    private val password = initialPassword

    fun auth(password: String): Boolean {
        return password == this.password
    }
}

fun main() {

    println("Пароль введен верно? ${User(" Ser ", "321").auth("321")}")

}