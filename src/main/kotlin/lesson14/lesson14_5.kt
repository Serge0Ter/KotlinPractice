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

    private fun printMessage(msg: Message, level: Int, children: Map<Int, List<ChildMessage>>) {
        val indent = "\t".repeat(level)
        println("$indent${msg.id} ${msg.author}: ${msg.message}")

        children[msg.id]?.forEach { child ->
            printMessage(child, level + 1, children)   // глубина растёт здесь
        }
    }

    fun printChat() {
        val children = messages
            .filterIsInstance<ChildMessage>()
            .groupBy { it.parentMessageId }

        messages.forEach { msg ->
            if (msg !is ChildMessage) {            // только корни
                printMessage(msg, 0, children)
            }
        }
    }
}

open class Message(val id: Int, val message: String, val author: String)
class ChildMessage(id: Int, message: String, author: String, val parentMessageId: Int) :
    Message(id, message, author)

