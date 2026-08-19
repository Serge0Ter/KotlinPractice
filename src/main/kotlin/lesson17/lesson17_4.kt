package org.example.lesson17

class Parcel(val id: Int, location: String) {
    private var _moveCount = 0
    val moveCount get() = _moveCount
    var location: String = location
        set(value) {
            field = value
            _moveCount++
        }
}

fun main() {

    val parcel = Parcel(123, "Москва")
    parcel.location = "Лондон"
    println(parcel.moveCount)
    parcel.location = "Америка"
    println(parcel.moveCount)

}