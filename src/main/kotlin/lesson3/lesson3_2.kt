package org.example.lesson3

fun main() {

    val firstName = "Татьяна"
    var lastName = "Андреева"
    val middleName = "Сергеевна"

    var age = 20

    println("[${lastName.trim()} ${firstName.trim()} ${middleName.trim()}, $age]")

    lastName = "Сидорова"
    age = 22

    println("[${lastName.trim()} ${firstName.trim()} ${middleName.trim()}, $age]")
}