package org.example.lesson5


fun main() {

    val randomNumbers = generateSequence { (0..42).random() }.distinct().take(3).toList()
    print("Введи 3 числа через пробел: ")
    val userNumbers = readln().split(" ").toList().map { it.toInt() }
    val numbersForWins = userNumbers intersect randomNumbers
    when (numbersForWins.size) {
        3 -> {
            println("Вы угадали все числа и выиграли джекпот")
        }

        2 -> {
            println("Вы угадали два числа и получает крупный приз")
        }

        1 -> {
            println("Вам выплачивается утешительный приз")
        }

        else -> {
            println("Вы не угадали ни одного числа")
        }
    }
    println("Выигрышные числа были: ${randomNumbers[0]}, ${randomNumbers[1]}, ${randomNumbers[2]}")
}
