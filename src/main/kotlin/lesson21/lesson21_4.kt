package org.example.lesson21

import java.io.File

fun main() {

    fun File.writeToFile(value: String) {
        val newText = value.lowercase().trim()
        val oldText = if (exists()) readText() else ""
        writeText(if (oldText.isEmpty()) newText else "$newText\n$oldText")
    }

    val file = File("test.txt")
    file.writeToFile("AnnA")
    file.writeToFile("apple")
    file.writeToFile("нда...")

}