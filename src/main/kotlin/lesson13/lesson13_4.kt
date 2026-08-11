package org.example.lesson13

class PhoneDirectory2(val userName: String, val userPhone: Long?, val userOrganization: String? = null) {

    fun printInfoUser() {
        println("Имя: $userName\nНомер: $userPhone\nКомпания: ${userOrganization ?: "<не указано>"}")
    }
}

fun main() {
    val list = mutableListOf<PhoneDirectory2>()
    val name = readln()
    val phone = readln().toLongOrNull()
    if (phone == null) {
        println("Некорректный номер")
        return
    }
    val organization: String? = readln().trim().ifEmpty { null }
    val user = PhoneDirectory2(name, phone, organization)
    list.add(user)
    list.map { it.printInfoUser() }
}