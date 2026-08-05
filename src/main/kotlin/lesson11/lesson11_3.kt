package org.example.lesson11

class User3(val id: Int, var nickName: String, var avatar: String, var status: String) {
    fun changeStatus(newStatus: String) {
        status = newStatus
    }
}

class Room(val id: Int, var title: String, var cover: String, val listUsers: List<User3>) {

    fun addUserToRoom(user: User3): List<User3> {
        val newList = listUsers.toMutableList().apply {
            add(user)
        }
        return newList.toList()
    }

    fun changeStatusUser(nickName: String, status: String) {
        listUsers.filter {
            it.nickName == nickName
        }.map {
            it.changeStatus(status)
        }
    }
}

fun main() {

    val room = Room(1, "Практика kotlin", "", listOf())
    val user1 = User3(1, "Sir", "", "микрофон выключен")
    val user2 = User3(2, "Ser", "", "микрофон выключен")
    val user3 = User3(3, "Lir", "", "разговаривает")

}