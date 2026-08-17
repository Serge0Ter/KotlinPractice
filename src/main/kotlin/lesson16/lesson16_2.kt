package org.example.lesson16

class Circle(private val radius: Int) {
    private val pi = 3.14
    fun length() = 2 * pi * radius
    fun square() = pi * radius * radius
}

fun main() {

    println("Площадь круга: ${Circle(4).square()}")
    println("Периметр круга: ${Circle(4).length()}")
}
