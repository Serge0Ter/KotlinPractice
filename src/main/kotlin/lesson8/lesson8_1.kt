package org.example.lesson8

fun main() {

    val week = IntArray(7)

    week.forEachIndexed { i, ch ->
        print("Кол-во рекламных просмотров: ")
        val count = readln().toIntOrNull() ?: -1
        if (count > 0) week[i] = count
    }

    println("Всего рекламы просмотрено за неделю: ${week.sum()}")

}