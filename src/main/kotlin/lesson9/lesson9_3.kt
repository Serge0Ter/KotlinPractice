package org.example.lesson9

fun main() {

    val friedEgg = listOf(2, 50, 15)

    print("Сколько порций хотите: ")
    val count = readln().toIntOrNull() ?: 0
    if (count != 0) println(
        "На $count порций вам понадобится: яиц – ${friedEgg[0] * count}," +
                " молока – ${friedEgg[1] * count}, сливочного масла – ${friedEgg[2] * count}"
    )

}