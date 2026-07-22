package org.example.lesson3

fun main() {

    val dataMove = "D2-D4;0"

    val items = dataMove.split(";")
    val startMove = items[0].split("-")[0]
    val endMove = items[0].split("-")[1]
    val count = items[1]

    println("$startMove\n$endMove\n$count")
}