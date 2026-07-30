package org.example.lesson7

fun main() {

    print("Введите число: ")
    val number = readln().toIntOrNull() ?: 0
    for (i in 0..number step 2) {
        println(i)
    }
}