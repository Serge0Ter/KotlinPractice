package org.example.lesson22

fun main() {
    val alfaCentauri = GalacticGuide(
        "Альфа Центавра А",
        "жёлтый карлик спектрального класса G2V, расположенная в созвездии Центавра",
        "6 миллиардов лет",
        4.36
    )
    println(alfaCentauri.component1())
    println(alfaCentauri.component2())
    println(alfaCentauri.component3())
    println(alfaCentauri.component4())
}

data class GalacticGuide(val name: String, val titleAreal: String, val date: String, val distance: Double)