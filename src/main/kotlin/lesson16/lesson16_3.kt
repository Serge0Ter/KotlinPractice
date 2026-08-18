package org.example.lesson16

class User(val login: String, password: String) {
    private val password = password

    fun auth(password: String): Boolean {
        return password == this.password
    }
}

fun main() {
    val user = User("Ser", readln())
    println("Пароль введен верно? ${user.auth(readln())}")

}