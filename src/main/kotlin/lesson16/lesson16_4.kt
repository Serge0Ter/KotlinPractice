package org.example.lesson16

class Order(private var status: String = "Создан") {
    private val id: Int = 1
    fun changedStatus(status: String) {
        this.status = status
        println("Статус изменен на: ${this.status}")
    }
}

fun main() {

    Order().changedStatus("Ожидание")

}