package org.example.lesson17

class User(login: String, password: String) {
    var login = login
        set(value) {
            field = value
            println("Логин изменен")
        }
    var password: String = password
        get() = field.replace(Regex("."), "*")
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {

    val user = User("Ser", "321321")
    println(user.password)
    user.password = "12312"
    user.login = "Lord"

}