package org.example.lesson14

class Chat {
    private var nextId = 1
    var messages: List<Message> = emptyList()
        private set

    fun addMessage(message: String, author: String) {
        messages += Message(nextId++, message, author)
    }

    fun addThreadMessage(message: String, author: String, parentMessageId: Int) {
        messages += ChildMessage(nextId++, message, author, parentMessageId)
    }

    fun printChat() {
        val children = messages
            .filterIsInstance<ChildMessage>()
            .groupBy { it.parentMessageId }
        messages.forEach { msg ->
            when (msg) {
                is ChildMessage -> {
                    children[msg.id]?.forEach { child ->
                        println("\t${child.author}: ${child.message}")
                    }
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

open class Message(val id: Int, val message: String, val author: String)
class ChildMessage(id: Int, message: String, author: String, val parentMessageId: Int) : Message(id, message, author)

