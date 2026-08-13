package org.example.lesson15

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Duck(val name: String) : Flyable, Swimmable {
    override fun fly() = println("$name летит")
    override fun swim() = println("$name плывёт")
}

class CrucianCarp(val name: String) : Swimmable {
    override fun swim() = println("$name плывёт")

}

class Seagull(val name: String) : Flyable {
    override fun fly() = println("$name летит")
}

fun main() {

    val duck = Duck("Уточка")
    duck.swim()
    duck.fly()
    val carp = CrucianCarp("Карп")
    carp.swim()
    val seagull = Seagull("Чайка")
    seagull.fly()
}