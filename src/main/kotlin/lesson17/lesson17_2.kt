package org.example.lesson17

class Ship(name: String, val avgSpeed: Int, val registrationPort: String) {
    var name: String = name
        set(value) {
            println("Нельзя менять имя")
        }
}

fun main() {

    val ship = Ship("See", 15, "VC")
    ship.name = "Vaee"
}