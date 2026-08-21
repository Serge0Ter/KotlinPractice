package org.example.lesson19

enum class Categories {
    CLOTHING, STATIONERY, OTHER;

    fun printCategory(categories: Categories): String = when (categories) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярия"
        OTHER -> "Остальное"
    }
}

class Product(val title: String, val id: Int, val categories: Categories) {
    fun printInfo() =
        println("Название товара: $title номер товара: $id категория товара: ${categories.printCategory(this.categories)}")
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

