package org.example.lesson19

enum class Gender(val title: String) {
    MALE("Мужской"), FEMALE("Женский")
}

class User(private val name: String, private val gender: Gender) {
    override fun toString(): String = "$name $gender"

}

fun main() {
    val list = mutableListOf<User>()
    println("Введите имя и пол. Пол вводить: MALE или FEMALE")
    while (list.size != 5) {
        print("Введите имя: ")
        val name = readln().trim()
        print("Введите пол: ")
        val gender = readln().trim()
        val user = when (gender) {
            "MALE" -> User(name, Gender.MALE)
            "FEMALE" -> User(name, Gender.FEMALE)
            else -> println("Неверное значение пола")
        }
        if (user is User) {
            list.add(user)
        }
    }
    list.forEach { println(it) }
}
