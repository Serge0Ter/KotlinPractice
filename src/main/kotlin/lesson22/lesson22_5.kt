package org.example.lesson22

fun main() {
    val (_, titleAreal, _, _) = GalacticGuide(
        "Альфа Центавра А",
        "жёлтый карлик спектрального класса G2V, расположенная в созвездии Центавра",
        "",
        4.36
    )
    println(titleAreal)
}

data class GalacticGuide(val name: String, val titleAreal: String, val date: String, val distance: Double)