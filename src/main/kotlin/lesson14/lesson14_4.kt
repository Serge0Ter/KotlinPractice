package org.example.lesson14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val canLand: Boolean,
)

class Planet(name: String, hasAtmosphere: Boolean, canLand: Boolean, val satellites: List<Satellite>) :
    CelestialBody(name, hasAtmosphere, canLand)

class Satellite(name: String, hasAtmosphere: Boolean, canLand: Boolean) : CelestialBody(name, hasAtmosphere, canLand)

fun main() {

    val titan = Satellite("Titan", false, false)
    val mimas = Satellite("Mimas", false, false)

    val saturn = Planet("Saturn", true, false, listOf(titan, mimas))
    println("${saturn.name} ${saturn.satellites.joinToString(" ") { it.name }}")

}

