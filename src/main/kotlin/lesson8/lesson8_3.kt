package org.example.lesson8

fun main() {

    val ingredients = arrayOf("морковь", "лук", "помидор", "мясо", "картошка", "перец")
    println("Какой ингредиент вы хотите найти?")
    val input = readln().trim().lowercase()
    if (ingredients.contains(input)) println("Этот ингредиент в рецепте есть") else println("Такого ингредиента в рецепте нет")

}