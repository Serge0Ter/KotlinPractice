package org.example.lesson4

fun main() {

    val day = 1

    val arms = true
    val legs = false
    val back = false
    val abs = true

    val result = if (1 == (day % 2)) {
        """
        Упражнения для рук:     $arms
        Упражнения для ног:     $legs
        Упражнения для спины:   $back
        Упражнения для пресса:  $abs
    """.trimIndent()
    } else {
        """
        Упражнения для рук:     ${!arms}
        Упражнения для ног:     ${!legs}
        Упражнения для спины:   ${!back}
        Упражнения для пресса:  ${!abs}
    """.trimIndent()
    }
    println(result)

}