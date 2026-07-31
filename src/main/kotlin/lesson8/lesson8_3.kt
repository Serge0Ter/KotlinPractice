package org.example.lesson8

fun main() {

    val ingredients = arrayOf("морковь", "лук", "помидор", "мясо", "картошка", "перец")
    print("Введи ингредиент для поиска: ")
    val input = readln().trim().lowercase()
    if (ingredients.contains(input)) println("Ингредиент $input в рецепте есть") else println("Такого ингредиента в рецепте нет")

}