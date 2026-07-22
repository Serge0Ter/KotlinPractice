package org.example.lesson3

fun main() {

    val daytimeGreeting = "Доброе утро"
    val eveningGreeting = "Добрый вечер"

    val userName = "Пользователь"

    var greetings = "$daytimeGreeting, $userName!"
    println(greetings)
    greetings = "$eveningGreeting, $userName!"
    println(greetings)
}