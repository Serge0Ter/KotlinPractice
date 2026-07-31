package org.example.lesson9

fun main() {

    val ingredients = listOf("морковь", "лук", "помидор", "мясо", "картошка", "перец")
    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }

}