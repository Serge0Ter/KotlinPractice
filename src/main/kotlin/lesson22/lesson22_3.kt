package org.example.lesson22

fun main() {

    val (name, author, year) = Book("Война и мир", "Л. Толстой", 1865)
    println("Название: $name автор: $author год: $year")
}

data class Book(val name: String, val author: String, val year: Int)