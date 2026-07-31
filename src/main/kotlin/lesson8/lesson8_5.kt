package org.example.lesson8

fun main() {

    print("Сколько ингредиентов будет? ")
    val count = readln().toIntOrNull() ?: -1
    if (count < 0) println("Неверное количество")
    val ingredients = Array(count) {
        print("Какой? ")
        readln()
    }
    println("Список готов: ${ingredients.joinToString(", ")}")
}