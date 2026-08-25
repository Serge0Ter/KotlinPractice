package org.example.lesson20

class Robot {
    private var modifier: ((String) -> String)? = null
    private val phraseSheet =
        listOf("Привет", "Прекрасный день не так ли", "Что хочешь узнать", "Kotlin сила", "Android top")

    fun say() {
        val phrase = phraseSheet.random()
        println(modifier?.let { it(phrase) } ?: phrase)

    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

}


fun main() {

    val robot = Robot()
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()


}
