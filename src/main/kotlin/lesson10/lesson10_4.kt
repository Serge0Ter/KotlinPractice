package org.example.lesson10

fun main() {
    var count = 0
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

            "Ничья" -> {
                userSoccer++; computerSoccer++
            }
        }
        print("Сыграем еще раз: ")
        val input = readln().trim()
        if (input.equals("да", ignoreCase = true)) count++ else win = false
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

fun generateNumber(): Int = (1..9).random()