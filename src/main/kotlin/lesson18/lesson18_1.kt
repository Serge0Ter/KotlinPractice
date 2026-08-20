package org.example.lesson18

class Order(private val id: Int) {

    fun printInfo(products: String) {
        println("Заказан товар: $products")
    }

    fun printInfo(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }
}

fun main() {

    val order = Order(1)
    val order1 = Order(1)
    order.printInfo("apple")
    order1.printInfo(listOf("apple", "orange", "cola"))
}
