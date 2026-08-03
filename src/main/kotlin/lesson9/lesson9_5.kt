package org.example.lesson9

fun main() {

    val ingredients = mutableListOf<String>().apply {
        repeat(5) {
            this += readln()
        }
    }.toSet().sorted().joinToString(", ").replaceFirstChar {
        it.titlecase()
    }

    println(ingredients)
}