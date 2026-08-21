package org.example.lesson18

abstract class Figure1(val name: String)

class Square(val side: Double) : Figure1("Квадрат") {
    override fun toString(): String {
        return "$name сторона: $side"
    }
}

class Dot(val side: Double) : Figure1("Точка") {
    override fun toString(): String {
        return "$name размер: $side"
    }
}

class Circle(val radius: Double) : Figure1("Круг") {
    override fun toString(): String {
        return "$name радиус: $radius"
    }
}

class Screen(val figure: Figure1) {
    fun draw(coordinatesX: Int, coordinatesY: Int): String {
        return "$figure координаты $coordinatesX : $coordinatesY "
    }

    fun draw(coordinatesX: Float, coordinatesY: Float): String {
        return "$figure координаты $coordinatesX : $coordinatesY "
    }
}
