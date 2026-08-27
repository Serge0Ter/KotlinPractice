package org.example.lesson21

fun Map<String, Int>.maxCategory(): String? {
    return entries.maxByOrNull { it.value }?.key
}
fun main() {

    val list = mapOf<String, Int>(
        "1" to 10,
        "2" to 20,
        "3" to 30,
        "4" to 40,
        "5" to 50,
        "6" to 50,
    )
    println(list.maxCategory())

}