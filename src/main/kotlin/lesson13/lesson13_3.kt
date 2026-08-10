package org.example.lesson13

class PhoneDirectory1(val userName: String, val userPhone: Long, val userOrganization: String? = null) {

    fun printInfoUser() {
        println("Имя: $userName\nНомер: $userPhone\nКомпания: ${userOrganization ?: "<не указано>"}")
    }
}


fun main() {

    val listUsers = listOf(
        PhoneDirectory1("Ser", 891239),
        PhoneDirectory1("Ter", 891439, "TDK"),
        PhoneDirectory1("Ser", 891759, "MBK"),
        PhoneDirectory1("Ser", 892229, "null"),
        PhoneDirectory1("Ser", 811119),
    )
    println(listUsers.filter {
        it.userOrganization != null
    }.map {
        it.userOrganization
    }
    )
}