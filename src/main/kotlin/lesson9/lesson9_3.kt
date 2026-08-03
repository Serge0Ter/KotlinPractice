package org.example.lesson9

fun main() {

    val friedEgg = mapOf(
        "яйца" to 2,
        "молоко" to 50,
        "масло" to 15
    )

    print("Сколько порций хотите: ")
    val count = readln().toIntOrNull() ?: 0
    if (count != 0) println(
        "На $count порций вам понадобится: яиц – ${friedEgg.getValue("яйца") * count}," +
                " молока – ${friedEgg.getValue("молоко") * count}, сливочного масла – ${friedEgg.getValue("масло") * count}"
    )

}