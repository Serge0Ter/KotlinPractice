package org.example.lesson7

fun main() {

    val numbers = 1..9
    val chars = 'a'..'z'

    var password = ""

    for (i in 1..6) {
        password += if (i % 2 == 0) chars.random() else numbers.random()
    }
    println(password)
}