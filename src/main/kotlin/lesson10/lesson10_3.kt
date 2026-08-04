package org.example.lesson10

fun main() {
    print("Сколько символов должно быть в пароле: ")
    println("Ваш пароль: ${generationPassword(readln().toIntOrNull() ?: 1)}")

}

fun generationPassword(length: Int): String {
    val digital = 0..9
    val symbol = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    var password = ""
    for (i in 1..length) {
        if (i % 2 == 0) password += digital.random() else password += symbol[(0..symbol.size - 1).random()]
    }
    return password
}