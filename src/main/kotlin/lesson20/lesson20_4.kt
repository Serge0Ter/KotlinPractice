package org.example.lesson20

fun main() {

    val list = listOf("Первый", "Второй", "Третий", "Четвёртый")
    list.map { { println("Нажат элемент $it") } }.forEachIndexed { index, action ->
        if (index % 2 == 0) action()
    }

}