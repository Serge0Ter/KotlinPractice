package org.example.lesson15

abstract class User(val name: String) {
    fun writeText(text: String) {
        println("$name публикует: $text")
    }

    fun readText() {
        println("Читает текст")
    }
}

interface Admin {
    fun deleteUser(userName: String)
    fun deleteText(text: String)
}

class AdminUser(name: String) : User(name), Admin {
    override fun deleteUser(userName: String) {
        println("$name удалил пользователя: $userName")
    }

    override fun deleteText(text: String) {
        println("$name удалил текст: $text")
    }

}

