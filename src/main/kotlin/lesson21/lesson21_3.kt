package org.example.lesson21

class Player(val name: String, var nowHeal: Int, val maxHeal: Int)

fun main() {

    fun Player.isHealthy(): Boolean = nowHeal == maxHeal

    val player = Player("AS",92, 100)
    println(player.isHealthy())

}