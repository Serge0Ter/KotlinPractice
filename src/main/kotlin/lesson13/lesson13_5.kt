package org.example.lesson13

class PhoneDirectory3(val userName: String, val userPhone: Long?, val userOrganization: String? = null) {

    fun printInfoUser() {
        println("Имя: $userName\nНомер: $userPhone\nКомпания: ${userOrganization ?: "<не указано>"}")
    }
}

fun main() {
    val list = mutableListOf<PhoneDirectory3>()
    while (true) {
        print("Введи имя: ")
        val name = readln().trim()
        if (name.isEmpty()) break
        val phone = try {
            print("Введи номер: ")
            readln().toLong()
        } catch (e: NumberFormatException) {
            println(e::class.simpleName)
            continue
        }
        print("Введи организацию: ")
        val organization = readln().trim().ifEmpty { null }
        val user = PhoneDirectory3(name, phone, organization)
        list.add(user)
    }
    list.forEach { it.printInfoUser() }
}