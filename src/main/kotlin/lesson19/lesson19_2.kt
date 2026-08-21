package org.example.lesson19

enum class Categories(val title: String) {
    CLOTHING("Одежда"), STATIONERY("Канцелярия"), OTHER("Остальное")
}

class Product(val title: String, val id: Int, val categories: Categories) {
    fun printInfo() {
        println(
            when (categories) {
                Categories.CLOTHING -> "Название товара: $title номер товара: $id категория товара: ${categories.title}"
                Categories.STATIONERY -> "Название товара: $title номер товара: $id категория товара: ${categories.title}"
                Categories.OTHER -> "Название товара: $title номер товара: $id категория товара: ${categories.title}"
            }
        )
    }
}

fun main() {

    val list = listOf(
        Product("Футболка", 1, Categories.CLOTHING),
        Product("Юбка", 2, Categories.CLOTHING),
        Product("Пена", 3, Categories.OTHER),
        Product("Скрепки", 4, Categories.STATIONERY),
    )

    list.forEach { it.printInfo() }
}