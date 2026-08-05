package org.example.lesson11

class User3(val id: Int, var nickName: String, var avatar: String, var status: String) {
    fun changeStatus(newStatus: String) {
        status = newStatus
    }
}

class Room(
    val id: Int,
    var title: String,
    var cover: String,
    val listUsers: MutableList<User3> = mutableListOf<User3>(),
) {

    fun addUserToRoom(user: User3) {
        listUsers.apply { add(user) }
    }

    fun changeStatusUser(nickName: String, status: String) {
        listUsers.find {
            it.nickName == nickName
        }?.changeStatus(status)
    }
}

fun main() {

    val room = Room(1, "Практика kotlin", "")
    val user1 = User3(1, "Sir", "", "микрофон выключен")
    val user2 = User3(2, "Ser", "", "микрофон выключен")
    val user3 = User3(3, "Lir", "", "разговаривает")

}