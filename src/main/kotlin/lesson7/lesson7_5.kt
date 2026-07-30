package org.example.lesson7

const val DEFAULT_LENGTH_PASSWORD = 6
fun main() {

    print("Какую длину пароля придумать: ")
    val passwordLength = readln().toIntOrNull() ?: 0

    when (passwordLength >= DEFAULT_LENGTH_PASSWORD) {
        true -> {
            println(generationPassword(passwordLength))
        }

        false -> {
            println(generationPassword(DEFAULT_LENGTH_PASSWORD))
        }
    }
}

fun generationPassword(length: Int): String {
    val digits = '0'..'9'
    val lower = 'a'..'z'
    val upper = 'A'..'Z'
    val allPool = digits + lower + upper
    val mandatory = listOf(digits.random(), lower.random(), upper.random())
    val remaining = List(length - 3) { allPool.random() }
    return (mandatory + remaining).shuffled().joinToString("")
}