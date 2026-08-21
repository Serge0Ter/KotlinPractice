package org.example.lesson18

class Square(val side: Double) {
    override fun toString(): String {
        return "Квадрат сторона: $side"
    }
}

class Dot(val side: Double) {
    override fun toString(): String {
        return "Точка размер: $side"
    }
}

class Circle(val radius: Double) {
    override fun toString(): String {
        return "Круг радиус: $radius"
    }
}

class Screen {
    fun draw(coordinatesX: Int, coordinatesY: Int, figure: Square): String {
        return "$figure координаты $coordinatesX : $coordinatesY "
    }

    fun draw(coordinatesX: Float, coordinatesY: Float, figure: Square): String {
        return "$figure координаты $coordinatesX : $coordinatesY "
    }

    fun draw(coordinatesX: Int, coordinatesY: Int, figure: Dot): String {
        return "$figure координаты $coordinatesX : $coordinatesY "
    }

    fun draw(coordinatesX: Float, coordinatesY: Float, figure: Dot): String {
        return "$figure координаты $coordinatesX : $coordinatesY "
    }

    fun draw(coordinatesX: Int, coordinatesY: Int, figure: Circle): String {
        return "$figure координаты $coordinatesX : $coordinatesY "
    }

    fun draw(coordinatesX: Float, coordinatesY: Float, figure: Circle): String {
        return "$figure координаты $coordinatesX : $coordinatesY "
    }
}
