package org.example.lesson20

class PLayer(val name: String, val isKey: Boolean)

fun main() {
    val player = PLayer("Ser", true);
    val result =
        { player: PLayer -> String; if (player.isKey == true) "Игрок открыл дверь" else "Дверь заперта" }(player)
    println(result)
}