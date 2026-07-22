package org.example.lesson3


fun main() {

    val number = 7
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(
        """
            $number * ${numbers[0]} = ${number * numbers[0]} 
            $number * ${numbers[1]} = ${number * numbers[1]} 
            $number * ${numbers[2]} = ${number * numbers[2]} 
            $number * ${numbers[3]} = ${number * numbers[3]} 
            $number * ${numbers[4]} = ${number * numbers[4]} 
            $number * ${numbers[5]} = ${number * numbers[5]} 
            $number * ${numbers[6]} = ${number * numbers[6]} 
            $number * ${numbers[7]} = ${number * numbers[7]} 
            $number * ${numbers[8]} = ${number * numbers[8]}
        """.trimIndent().replace("*", "x")
    )

}