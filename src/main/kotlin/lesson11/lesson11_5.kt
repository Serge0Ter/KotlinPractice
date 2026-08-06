package org.example.lesson11

class UserForum private constructor(val userId: Int, val userName: String) {
    class Builder {
        private var userId = 1
        private var userName = ""
        fun userId(value: Int) = apply { userId = value }
        fun userName(value: String) = apply { userName = value }

        fun build(): UserForum = UserForum(userId, userName)
    }

    companion object {
        fun builder(): Builder = Builder()
    }
}

class MessageForum private constructor(val authorId: Int, val message: String) {
    class Builder {
        private var authorId = 1
        private var message = ""
        fun authorId(value: Int) = apply { authorId = value }
        fun message(value: String) = apply { message = value }

        fun build(): MessageForum = MessageForum(authorId, message)
    }

    companion object {
        fun builder(): Builder = Builder()
    }

}


class Forum(
    private val users: MutableList<UserForum> = mutableListOf(),
    private val allMessage: MutableList<MessageForum> = mutableListOf(),
    private var nestId: Int = 1,
) {
    fun createNewUser(userName: String): UserForum {
        val user = UserForum.builder()
            .userId(nestId++)
            .userName(userName)
            .build()
        users.add(user)
        return user
    }

    fun createNewMessage(id: Int, message: String) {
        val authorId = users.find { it.userId == id }?.userId ?: 0
        if (authorId != 0) {
            val messageForum = MessageForum.builder()
                .authorId(id)
                .message(message)
                .build()
            allMessage.add(messageForum)
        }
    }

    fun printThread() {
        allMessage.forEach { msg ->
            users.find { it.userId == msg.authorId }?.let {
                println("${it.userName}: ${msg.message}")
            }
        }
    }
}

fun main() {

    val forum = Forum()
    forum.createNewUser("Ser")
    forum.createNewUser("Anna")
    forum.createNewMessage(1, "Ну как то так")
    forum.createNewMessage(1, "Сойдет?")
    forum.createNewMessage(2, "Ну тпа да")
    forum.createNewMessage(2, "Пойдет!")
    forum.printThread()

}