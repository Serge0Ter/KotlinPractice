package org.example.lesson9

fun main() {

    print("Введите 5 ингредиентов: ")
    val ingredients = readln().split(", ").sorted()
    println(ingredients)
}