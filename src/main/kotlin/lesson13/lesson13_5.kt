package org.example.lesson13

class PhoneDirectory3(val userName: String, val userPhone: Long?, val userOrganization: String? = null) {

    fun printInfoUser() {
        println("Имя: $userName\nНомер: $userPhone\nКомпания: ${userOrganization ?: "<не указано>"}")
    }
}

fun main() {
    val list = mutableListOf<PhoneDirectory3>()
    val user = PhoneDirectory3(readln(), readln().toLongOrNull() ?: 0, readln().trim())

    try {
        user.userPhone?.toLong()
    } catch (e: Exception) {
        println(e.message)
    }
    if (user.userPhone != 0.toLong()) {
        list.add(user)
    }
    list.map { it.printInfoUser() }


}