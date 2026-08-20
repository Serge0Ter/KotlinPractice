package org.example.lesson18

open class Dice() {
    open fun loadingDice() {}
}

class FourSidedDice() : Dice() {
    override fun loadingDice() {
        println("Выпало: ${(1..4).random()}")
    }
}

class SixSidedDice() : Dice() {
    override fun loadingDice() {
        println("Выпало: ${(1..6).random()}")
    }
}

class OctahedralDice() : Dice() {
    override fun loadingDice() {
        println("Выпало: ${(1..8).random()}")
    }
}

fun main() {

    val dice4 = FourSidedDice()
    val dice6 = SixSidedDice()
    val dice8 = OctahedralDice()
    val listDice = listOf(dice4, dice6, dice8)
    listDice.forEach { it.loadingDice() }
}

