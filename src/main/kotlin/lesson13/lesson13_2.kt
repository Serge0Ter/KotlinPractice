package org.example.lesson13

class PhoneDirectory(val userName: String, val userPhone: Long, val userOrganization: String? = null) {

    fun printInfoUser() {
        println("Имя: $userName\nНомер: $userPhone\nКомпания: ${userOrganization ?: "не указано"}")
    }
}
