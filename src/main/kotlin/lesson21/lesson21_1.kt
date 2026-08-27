package org.example.lesson21

fun main() {

    fun String.vowelCount(): Int {
        val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU"
        return count { it in vowels }
    }

    println("hello".vowelCount())

}