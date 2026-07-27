package org.example.lesson4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100


fun main() {

    var weightPackage = 20
    var volumePackage = 80

    println(
        "Груз с весом $weightPackage кг и объемом $volumePackage л соответствует категории 'Average':" +
                " ${((weightPackage > MIN_WEIGHT) || !(weightPackage >= MAX_WEIGHT)) && (volumePackage < MAX_VOLUME)}"
    )

    weightPackage = 50
    volumePackage = 100

    println(
        "Груз с весом $weightPackage кг и объемом $volumePackage л соответствует категории 'Average':" +
                " ${((weightPackage > MIN_WEIGHT) || !(weightPackage >= MAX_WEIGHT)) && (volumePackage < MAX_VOLUME)}"
    )
}