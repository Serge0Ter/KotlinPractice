package org.example.lesson20

class Player(val name: String, var nowHeal: Int, val maxHeal: Int)

fun main() {
    val player = Player("Ser", 58, 100)
    val medicalKit: (Player) -> Unit = {
        it.nowHeal = it.maxHeal
    }
    medicalKit(player)
}