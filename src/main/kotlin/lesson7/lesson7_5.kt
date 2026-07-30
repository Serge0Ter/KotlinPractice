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
            println("Слишком короткий")
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
    val remaining = allPool.shuffled().take(length - 3)
    return (mandatory + remaining).shuffled().joinToString("")
}