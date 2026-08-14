package org.example.lesson15

abstract class Product(val name: String, val count: Int)
abstract class Instrumental(name: String, count: Int) : Product(name, count), SearchComponent
abstract class Components(name: String, count: Int) : Product(name, count)

interface SearchComponent {
    fun search(name: Components) {
        println("Выполняется поиск")
    }
}
