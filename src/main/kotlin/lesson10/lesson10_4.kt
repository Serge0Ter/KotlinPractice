package org.example.lesson10

fun main() {

    var win = true
    var userSoccer = 0
    var computerSoccer = 0

    while (win) {
        when (playGame()) {
            "Выиграл человек" -> {
                userSoccer++
            }

            "Выиграл компьютер" -> {
                computerSoccer++
            }

            "Ничья" -> {}
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val input = readln().trim()
        if (input.equals("нет", ignoreCase = true)) win = false
    }
    println("Ты выиграл $userSoccer раз")

}

fun playGame(): String {
    println("Ход человека")
    val people = generateNumber()
    println("Выпало значение: $people")
    println("Ход компьютера")
    val computer = generateNumber()
    println("Выпало значение: $computer")
    return when {
        people > computer -> "Выиграл человек"
        people < computer -> "Выиграл компьютер"
        else -> "Ничья"
    }
}

fun generateNumber(): Int = (1..6).random()