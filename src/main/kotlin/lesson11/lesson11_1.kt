package org.example.lesson11

class User(val id: Int, val login: String, val password: String, val mail: String) {
}

fun main() {

    val user1 = User(1, "Ser", "123", "ser@rd")
    val user2 = User(2, "Sir", "321", "sir@rd")

    println("${user1.id} ${user1.login} ${user1.password} ${user1.mail}")
    println("${user2.id} ${user2.login} ${user2.password} ${user2.mail}")
}