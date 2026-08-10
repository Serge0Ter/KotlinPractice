package org.example.lesson13

class PhoneDirectory2(val userName: String, val userPhone: Long?, val userOrganization: String? = null) {

    fun printInfoUser() {
        println("Имя: $userName\nНомер: $userPhone\nКомпания: ${userOrganization ?: "<не указано>"}")
    }
}

fun main() {
    val list = mutableListOf<PhoneDirectory2>()
    val user = PhoneDirectory2(readln(), readln().toLongOrNull() ?: 0, readln().trim())
    if (user.userPhone != 0.toLong()) {
        list.add(user)
    }
    list.map { it.printInfoUser() }
}