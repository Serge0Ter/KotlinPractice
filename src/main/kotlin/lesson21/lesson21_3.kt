package org.example.lesson21

class Player(val name: String, var nowHeal: Int, val maxHeal: Int)
fun Player.isHealthy(): Boolean = nowHeal == maxHeal
fun main() {

    val player = Player("AS",92, 100)
    println(player.isHealthy())

}