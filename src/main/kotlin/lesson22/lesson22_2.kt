package org.example.lesson22

class RegularBook1(val name: String, val author: String)
data class DataBook1(val name: String, val author: String)

fun main() {

    val r1 = RegularBook1("Война и мир", "Л. Толстой")
    val d1 = DataBook1("Друг из Рима", "Лука Спагетти")
    println(r1) // не переопределен .toString, поэтому выводит адрес хранения
    println(d1) // переопределен .toString, поэтому выводит информацию об объекте
}