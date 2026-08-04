package org.example.lesson11

class User(val id: Int, val login: String, var password: String, val mail: String, var bio: String) {
    fun userInfo() {
        println("$id $login $password $mail $bio")
    }

    fun inputBio() {
        bio = readln()
    }

    fun changePassword() {
        print("Введи пароль: ")
        val oldPassword = readln()
        if (oldPassword == password) {
            print("Введи новый пароль: ")
            password = readln()
            println("Пароль изменен")
        }
    }
}

fun main() {

    val user = User(1, "Sir", "123", "sir@bk", "")
    user.changePassword()
    user.userInfo()

}