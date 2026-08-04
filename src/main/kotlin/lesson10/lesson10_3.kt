package org.example.lesson10

fun main() {
    print("Сколько символов должно быть в пароле: ")
    println("Ваш пароль: ${generatePassword(readln().toIntOrNull() ?: 1)}")

}

fun generatePassword(length: Int): String {
    val digital = 0..9
    val symbol = ' '..'/'
    var password = ""
    for (i in 1..length) {
        if (i % 2 == 0) password += digital.random() else password += symbol.random()
    }
    return password
}