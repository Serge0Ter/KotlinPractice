package org.example.lesson16

class User(val login: String) {
    private val password = "initial"

    fun auth(password: String): Boolean {
        return readln() == this.password
    }
}

fun main() {

    println("Пароль введен верно? ${User(" Ser ").auth("321")}")

}