package org.example.lesson14

open class Liner(
    open val speed: Int = 15,
    open val passengerCapacity: Int = 1000,
    open val cargoCapacity: Int = 500,
)

class Icebreaker : Liner() {
    override val speed: Int = 10
    override val passengerCapacity: Int = 300
    override val cargoCapacity: Int = 300
    val isBreakIce: Boolean = true
}

class Freighter : Liner() {
    override val speed: Int = 10
    override val passengerCapacity: Int = 600
    override val cargoCapacity: Int = 600
}

fun main() {

    val liner = Liner()
    val icebreaker = Icebreaker()
    val freighter = Freighter()

}
