package org.example.lesson4

const val ALL_TABLE = 13

fun main() {

    val bookedToday = 13
    val bookedTomorrow = 9

    val today = ALL_TABLE > bookedToday
    val tomorrow = ALL_TABLE > bookedTomorrow

    println("Доступность столиков на сегодня: $today\nДоступность столиков на завтра: $tomorrow")
}