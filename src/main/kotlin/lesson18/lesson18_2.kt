package org.example.lesson18

class Dice(val countSide: Int) {
    fun loadingDice(count: Int) {
        println("Выпало: ${(1..count).random()}")
    }
}

fun main() {

    val dice4 = Dice(4)
    val dice6 = Dice(6)
    val dice8 = Dice(8)
    val listDice = listOf<Dice>(dice4, dice6, dice8)
    listDice.forEach { it.loadingDice(it.countSide) }
}

