package org.example.lesson16

class Player(val name: String, private var health: Int, var damage: Int) {

    private fun dead() {
        if (health <= 0) {
            damage = 0
            println("Смерть")
        }
    }

    fun getDamage(damage: Int) {
        health -= damage
        dead()
    }

    fun healing(health: Int) {
        this.health += health
    }
}

fun main() {
    val player = Player("", 100, 15)
    player.getDamage(40)
    player.healing(20)
    player.getDamage(60)
    player.healing(10)
    player.getDamage(40)
}