package org.example.lesson8

fun main() {

    val ingredients = arrayOf("морковь", "лук", "помидор", "мясо", "картошка", "перец")
    println(ingredients.joinToString(", "))
    print("Какой ингредиент хотите заменить? ")
    val ingredient = readln()
    if (!ingredients.contains(ingredient)) {
        println("Такого ингредиента нет")
        return
    }
    print("На что вы хотите заменить его? ")
    val newIngredient = readln()
    ingredients.forEachIndexed { index, count ->
        if (count == ingredient) {
            ingredients[index] = newIngredient
        }
    }
    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
}