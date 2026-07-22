package org.example.lesson3

fun main() {

    var dataMove = "D2-D4;0"

    val items = dataMove.split(";")
    var startMove = items[0].split("-")[0]
    var endMove = items[0].split("-")[1]
    var count = items[1]

    println("$startMove\n$endMove\n$count")
}