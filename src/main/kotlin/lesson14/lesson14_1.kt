package org.example.lesson14

open class Liner() {
    open val speed: Int = 15
    open val capacity: Int = 500
}

class Icebreaker() : Liner() {
    override val speed: Int = 10
    override val capacity: Int = 300
    val isBreakIce: Boolean = true
}

class Freighter() : Liner() {
    override val speed: Int = 15
    override val capacity: Int = 300
    val cargo: Int = 600
}

fun main() {

    val liner = Liner()
    val icebreaker = Icebreaker()
    val freighter = Freighter()

}
