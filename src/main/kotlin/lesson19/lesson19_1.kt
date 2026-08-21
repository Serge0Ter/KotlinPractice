package org.example.lesson19

enum class Fish(val title: String) {
    GUPPY("Гуппи"),
    ANGEL_FISH("Скалярия"),
    GOLD_FISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

fun main() {

    println("Ты можешь добавить: ${Fish.entries.joinToString(", ")}")
}