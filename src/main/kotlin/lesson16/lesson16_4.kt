package org.example.lesson16

class Order(id: Int, private var status: String = "Создан") {
    private val _id: Int = id
    private fun _changedStatus(status: String) {
        this.status = status
        println("Статус изменен на: ${this.status}")
    }

    fun changeStatus(status: String) = _changedStatus(status)
}

fun main() {

    Order(1).changeStatus("Ожидание")

}