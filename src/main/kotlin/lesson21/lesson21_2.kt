package org.example.lesson21

fun main() {
    fun List<Int>.evenNumbersSum(): Int {
        return this.filter { it % 2 == 0 }.sum()
    }

    val list = listOf(1, 2, 3, 4, 5, 6)
    println(list.evenNumbersSum())

}