package org.example.lesson3


fun main() {

    var startMove = "E2"
    var endMove = "E4"
    var count = 1

    fun dataMove(): String = "[${startMove.uppercase().trim()}-${endMove.uppercase().trim()};$count]"

    println(dataMove())

    startMove = "D2"
    endMove = "D3"
    count++

    println(dataMove())
}