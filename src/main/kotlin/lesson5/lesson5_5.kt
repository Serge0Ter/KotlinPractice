package org.example.lesson5


fun main() {

    val randomNumbers = generateSequence { (0..42).random() }.distinct().take(3).toList()
    print("Введи 1 число: ")
    val number1 = readln().toInt()
    print("Введи 2 число: ")
    val number2 = readln().toInt()
    print("Введи 3 число: ")
    val number3 = readln().toInt()
    val userNumbers = listOf(number1, number2, number3)
    val numbersForWins = userNumbers intersect randomNumbers
    val size = numbersForWins.size
    when (size) {
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
