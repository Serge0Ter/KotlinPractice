package org.example.lesson16

class Roll(private val number: Int = (1..6).random()) {
    fun number() = println(number)
}

fun main() {
    val roll = Roll()
    roll.number()
}