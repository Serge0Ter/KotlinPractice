package org.example.lesson14

open class Liner1(
    open val speed: Int = 15,
    open val passengerCapacity: Int = 1000,
    open val cargoCapacity: Int = 500,
) {
    open fun loading() {
        println("${this::class.simpleName} Выдвигает горизонтальный трап со шкафута")
    }

    open fun printInfo() {
        println("${this::class.simpleName} скорость: $speed пассажирская вместимость: $passengerCapacity грузовая вместимость: $cargoCapacity ")
    }
}

class Icebreaker1 : Liner1() {
    override val speed: Int = 10
    override val passengerCapacity: Int = 300
    override val cargoCapacity: Int = 300
    val isBreakIce: Boolean = true

    override fun loading() {
        println("${this::class.simpleName} Открывает ворота со стороны кормы")
    }

    override fun printInfo() {
        super.printInfo()
        println("может колоть лед: $isBreakIce")
    }
}

class Freighter1 : Liner1() {
    override val speed: Int = 10
    override val passengerCapacity: Int = 600
    override val cargoCapacity: Int = 600

    override fun loading() {
        println("${this::class.simpleName} Активирует погрузочный кран")
    }

    override fun printInfo() {
        super.printInfo()
    }
}

fun main() {

    val liner = Liner1()
    liner.loading()
    liner.printInfo()
    val icebreaker = Icebreaker1()
    icebreaker.loading()
    icebreaker.printInfo()
    val freighter = Freighter1()
    freighter.loading()
    freighter.printInfo()

}
