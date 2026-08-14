package org.example.lesson15

class PassengerCar(override val maxPeople: Int = 3) : Drivable, BoardingLoading {
    override fun drive() {
        println("Еду быстро")
    }

    override fun boardingLoading(countPeople: Int) {
        when (countPeople) {
            0 -> println("Еду без пассажира")
            1 -> println("Посадил 1 пассажира")
            2 -> println("Посадил 2 пассажиров")
            3 -> println("Посадил 3 пассажиров")
            else -> {}
        }
    }

    override fun unloadingPeople(countPeople: Int) {
        when (countPeople) {
            0 -> println("Ехал без пассажира")
            1 -> println("Высаживаю 1 пассажира")
            2 -> println("Высаживаю 2 пассажиров")
            3 -> println("Высаживаю 3 пассажиров")
            else -> {}
        }
    }
}

class Truck(override val maxPeople: Int = 1, override val maxCargo: Float) : Drivable, BoardingLoading, CargoLoading {
    override fun drive() {
        println("Еду не так быстро")
    }

    override fun boardingLoading(countPeople: Int) {
        when (countPeople) {
            0 -> println("Еду без пассажира")
            1 -> println("Везу человека")
            else -> {}
        }
    }

    override fun unloadingPeople(countPeople: Int) {
        when (countPeople) {
            0 -> println("Ехал без пассажира")
            1 -> println("Высаживаю 1 пассажира")
            else -> {}
        }
    }

    override fun cargoLoading(countWeight: Float) {
        when (countWeight) {
            in 0f..2f -> println("Загрузили $countWeight т")
            else -> {}
        }
    }

    override fun unloadingCargo(countWeight: Float) {
        when (countWeight) {
            in 0f..2f -> println("Выгружаю $countWeight т")
            else -> {}
        }
    }

}

interface Drivable {
    fun drive()
}

interface BoardingLoading {
    val maxPeople: Int
    fun boardingLoading(countPeople: Int)
    fun unloadingPeople(countPeople: Int)

}

interface CargoLoading {
    val maxCargo: Float
    fun cargoLoading(countWeight: Float)
    fun unloadingCargo(countWeight: Float)
}

fun main() {

    val truck = Truck(0, 2f)
    truck.cargoLoading(2f)
    val car1 = PassengerCar(3)
    car1.boardingLoading(3)
    val car2 = PassengerCar(3)
    car2.boardingLoading(3)
}