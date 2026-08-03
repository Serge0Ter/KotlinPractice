package org.example.lesson9

fun main() {

    val friedEgg = listOf(2, 50, 15)

    print("Сколько порций хотите: ")
    val count = readln().toIntOrNull() ?: -1
    if (count >= 0) println(
        "На $count порций вам понадобится: Яиц – ${friedEgg[0] * count} шт," +
                " молока – ${friedEgg[1] * count} мл, сливочного масла – ${friedEgg[2] * count} гр"
    )

}