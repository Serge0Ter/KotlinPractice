package org.example.lesson10

fun main() {
    println("Ход человека")
    val people = rollDice()
    println("Выпало значение: $people")
    println("Ход компьютера")
    val computer = rollDice()
    println("Выпало значение: $computer")
    when {
        people > computer -> println("Выиграл человек")
        people < computer -> println("Выиграл компьютер")
        else -> println("Ничья")
    }
}

fun rollDice() = (1..6).random()