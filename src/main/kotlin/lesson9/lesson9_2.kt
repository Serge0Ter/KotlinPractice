package org.example.lesson9

fun main() {
    val ingredients = mutableListOf("морковь", "лук", "помидор")
    println("В рецепте есть базовые ингредиенты: $ingredients")
    print("Желаете добавить еще? ")
    val input = readln()
    if (input.equals("да", true)) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readln()
        ingredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }
}