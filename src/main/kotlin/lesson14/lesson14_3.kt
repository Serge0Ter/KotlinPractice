package org.example.lesson14

abstract class Figure(val color: String) {
    abstract fun perimeter(): Double
    abstract fun area(): Double
}

class Rectangle(color: String, val a: Double, val b: Double) : Figure(color) {
    override fun perimeter() = 2 * (a + b)

    override fun area() = a * b

}

class Circle(color: String, val r: Double) : Figure(color) {
    override fun perimeter() = 2 * r * kotlin.math.PI

    override fun area() = kotlin.math.PI * r * r

}

fun main() {

    val circleBlack = Circle("black", 15.0)
    val circleWhite = Circle("white", 15.0)
    val rectangleBlack = Rectangle("black", 15.0, 10.0)
    val rectangleWhite = Rectangle("white", 15.0, 10.0)
    val list = listOf(circleBlack, circleWhite, rectangleBlack, rectangleWhite)
    val perimeterAllBlackFigures = list.filter { it.color.equals("black", true) }.sumOf { it.perimeter() }
    val areaAllWhiteFigures = list.filter { it.color.equals("white", true) }.sumOf { it.area() }
    println(perimeterAllBlackFigures)
    println(areaAllWhiteFigures)

}