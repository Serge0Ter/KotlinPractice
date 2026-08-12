package org.example.lesson14

open class Liner(open val speed: Int = 15, open val capacity: Int = 500)
class Icebreaker(override val speed: Int, override val capacity: Int, val isBreakIce: Boolean = true) :
    Liner(speed, capacity)

class Freighter(override val speed: Int, override val capacity: Int) : Liner(speed, capacity)

fun main() {

    val liner = Liner()
    val icebreaker = Icebreaker(10, 300)
    val freighter = Freighter(15, 600)

}
