package org.example.lesson13

class PhoneDirectory2(val userName: String, val userPhone: Long?, val userOrganization: String? = null) {

    fun printInfoUser() {
        println("Имя: $userName\nНомер: $userPhone\nКомпания: ${userOrganization ?: "<не указано>"}")
    }
}

fun main() {
    val list = mutableListOf<PhoneDirectory2>()
    while (true) {
        print("Введи имя: ")
        val name = readln()
        if (name.isEmpty()) {
            break
        }
        print("Введи номер: ")
        val phone = readln().toLongOrNull()
        if (phone == null) {
            println("Некорректный номер")
            continue
        }
        print("Введи организацию: ")
        val organization = readln().trim().ifEmpty { null }
        val user = PhoneDirectory2(name, phone, organization)
        list.add(user)
    }
    list.forEach { it.printInfoUser() }
}