package org.example.lesson14

class Chat {
    private var nextId = 1
    var messages: List<Message> = emptyList()
        private set

    fun addMessage(author: String, message: String) {
        messages += Message(nextId++, author, message)
    }

    fun addThreadMessage(parentMessageId: Int, author: String, message: String) {
        messages += ChildMessage(nextId++, author, message, parentMessageId)
    }

    fun printChat() {
        val children = messages
            .filterIsInstance<ChildMessage>()
            .groupBy { it.parentMessageId }
        messages.forEach { msg ->
            when (msg) {
                is ChildMessage -> {

                }

                else -> {
                    println("${msg.id} ${msg.author}: ${msg.message}")
                    children[msg.id]?.forEach { child ->
                        println("\t${child.author}: ${child.message}")
                    }
                }
            }
        }
    }
}

open class Message(val id: Int, val author: String, val message: String)
class ChildMessage(id: Int, author: String, message: String, val parentMessageId: Int) : Message(id, author, message)


