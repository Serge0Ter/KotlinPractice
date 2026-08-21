package org.example.lesson18

abstract class Figure {
    abstract fun square(): Double
}

class Cube(val side: Double) : Figure() {
    override fun square(): Double {
        return 6 * side * side
    }
}

class Rectangle(val width: Double, val length: Double, val height: Double) : Figure() {
    override fun square(): Double {
        return 2 * (width * length + width * height + length * height)
    }
}

fun main() {

    val listFigures = listOf<Figure>(Cube(15.0), Rectangle(10.0, 5.0, 4.0))
    listFigures.forEach { println("Площадь посылки: ${it.square()} см3") }
}