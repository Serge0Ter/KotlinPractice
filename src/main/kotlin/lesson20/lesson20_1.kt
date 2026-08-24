package org.example.lesson20

fun main() {

    val userName: (String) -> String = { username: String -> "С наступающим Новым Годом, $username!" }
    println(userName("Ser"))

}