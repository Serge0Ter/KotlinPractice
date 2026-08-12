package org.example.lesson14

open class Liner(val speed: Int, val capacity: Int)
class Icebreaker(speed: Int, capacity: Int, val isBreakIce: Boolean = true) : Liner(speed, capacity)
class Freighter(speed: Int, capacity: Int) : Liner(speed, capacity)

fun main() {

    val liner = Liner(15, 500)
    val icebreaker = Icebreaker(10, 300)
    val freighter = Freighter(15, 600)

}
