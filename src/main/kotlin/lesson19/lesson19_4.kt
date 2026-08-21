package org.example.lesson19

enum class Patron(val damage: Int) {
    RED(20), BLUE(5), GREEN(10);

    fun shutting(patron: Patron): String = "Выстрел ${patron.name} патроном с уроном ${patron.damage}"

}

class Tank {
    private var _patron: Patron? = null
    fun takeNewPatron(patron: Patron) {
        _patron = when (patron) {
            Patron.RED -> patron
            Patron.BLUE -> patron
            Patron.GREEN -> patron
        }
    }

    fun shutting() {
        println(if (_patron != null) _patron?.shutting(_patron!!) else "Нет патронов")
    }

}

fun main() {
    val tank = Tank()
    tank.shutting()
    tank.takeNewPatron(Patron.RED)
    tank.shutting()
    tank.shutting()
    tank.takeNewPatron(Patron.GREEN)
    tank.shutting()

}