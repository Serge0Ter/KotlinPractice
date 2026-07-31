package org.example.lesson8

fun main() {

    val ingredients = arrayOf("морковь", "лук", "помидор", "мясо", "картошка", "перец")
    print("Введи ингредиент для поиска: ")
    val input = readln().trim().lowercase()
    for (i in ingredients) {
        if (i == input) {
            println("Ингредиент $input в рецепте есть")
            break
        }
    }
    if (!ingredients.contains(input)) println("Такого ингредиента в рецепте нет")
}