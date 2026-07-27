package org.example.lesson4

fun main() {

    var day = 1

    val arms = true
    val legs = false
    val back = false
    val abs = true

    if (1 == (day % 2)) {
        println(
            "Упражнения для рук: $arms\nУпражнения для ног: $legs\nУпражнения для спины: $back\nУпражнения для пресса: $abs"
        )
    } else {
        println(
            "Упражнения для рук: ${!arms}\nУпражнения для ног: ${!legs}\nУпражнения для спины: ${!back}\nУпражнения для пресса: ${!abs}"
        )
    }

}