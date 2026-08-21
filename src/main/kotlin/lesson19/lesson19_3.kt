package org.example.lesson19

enum class ShipStatus {
    TAKEOFF, LAND, SHUTTING;

    fun describe(status: ShipStatus): String = when (status) {
        TAKEOFF -> TODO()
        LAND -> TODO("здесь нужна информация о дополнительной логике")
        SHUTTING -> "Отстрел астеройдов"
    }
}
