package org.example.lesson22

class RegularBook(val name: String, val author: String)
data class DataBook(val name: String, val author: String)

fun main() {
    val r1 = RegularBook("Война и мир", "Л. Толстой")
    val r2 = RegularBook("Война и мир", "Л. Толстой")
    val d1 = DataBook("Друг из Рима", "Лука Спагетти")
    val d2 = DataBook("Друг из Рима", "Лука Спагетти")
    println(r1 == r2) // false сравнивает ссылки в переменны. А это 2 разных объекта.
    println(d1 == d2) // true сравнивает переменные внутри конструктора класса и они одинаковы.

}