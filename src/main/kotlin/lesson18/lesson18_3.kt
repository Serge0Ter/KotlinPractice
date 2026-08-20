package org.example.lesson18

abstract class Pet(val name: String) {
    abstract fun eat(): String

    open fun sleep() {
        println("$name -> сплит")
    }
}

class Cat(name: String) : Pet(name) {
    override fun eat(): String {
        return "ем рыбу"
    }
}

class Fox(name: String) : Pet(name) {
    override fun eat(): String {
        return "ем ягоды"
    }
}

class Dog(name: String) : Pet(name) {
    override fun eat(): String {
        return "ем кости"
    }
}

fun main() {
    val listPets = listOf<Pet>(Cat("Барсик"), Dog("Тузик"), Fox("Марфина"))
    listPets.forEach { println("${it.name} -> ${it.eat()}") }
}