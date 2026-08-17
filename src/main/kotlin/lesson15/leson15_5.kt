package org.example.lesson15

class PassengerCar(override val maxPeople: Int = 3) : Drivable, BoardingLoading {

    private var nowPeople: Int = 0

    override fun drive() {
        println("Еду быстро")
    }

    override fun boardingLoading(countPeople: Int) {
        when ((nowPeople + countPeople) <= maxPeople) {
            true -> {
                nowPeople += countPeople
                println("Посадил $nowPeople. Осталось ${maxPeople - nowPeople}")
            }

            false -> {
                println("Нет мест")
            }
        }
    }

    override fun unloadingPeople(countPeople: Int) {
        when ((nowPeople - countPeople) < 0) {
            true -> {
                println("Столько людей нет")
            }

            false -> {
                println("Высаживаю $countPeople. Осталось ${nowPeople - countPeople}")
                nowPeople -= countPeople
            }
        }
    }
}

class Truck(
    override val maxPeople: Int = 1, override val maxCargo: Float = 2f,
) : Drivable, BoardingLoading, CargoLoading {

    private var nowPeopleTruck = 0
    private var nowCargo = 0f

    override fun drive() {
        println("Еду не так быстро")
    }

    override fun boardingLoading(countPeople: Int) {
        when ((nowPeopleTruck + countPeople) <= maxPeople) {
            true -> {
                nowPeopleTruck += countPeople
                println("Посадил $nowPeopleTruck. Осталось ${maxPeople - nowPeopleTruck}")
            }

            false -> {
                println("Нет мест")
            }
        }
    }

    override fun unloadingPeople(countPeople: Int) {
        when ((nowPeopleTruck - countPeople) < 0) {
            true -> {
                println("Столько людей нет")
            }

            false -> {
                println("Высаживаю $countPeople. Осталось ${nowPeopleTruck - countPeople}")
                nowPeopleTruck -= countPeople
            }
        }
    }

    override fun cargoLoading(countWeight: Float) {
        when ((nowCargo + countWeight) <= maxCargo) {
            true -> {
                nowCargo += countWeight
                println("Загрузили $countWeight т. Осталось ${maxCargo - nowCargo}")
            }

            false -> println("Нет места")
        }
    }

    override fun unloadingCargo(countWeight: Float) {
        when ((nowCargo - countWeight) < 0) {
            true -> {
                println("Столько груза нет")
            }

            false -> {
                println("Выгружаю $countWeight т")
                nowCargo -= countWeight
            }
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

    val truck = Truck(1, 2f)
    truck.cargoLoading(2f)
    truck.boardingLoading(1)
    truck.drive()
    truck.unloadingCargo(1.5f)
    val car1 = PassengerCar(3)
    car1.boardingLoading(3)
    car1.drive()
    car1.unloadingPeople(3)
    val car2 = PassengerCar(3)
    car2.boardingLoading(2)
    car2.drive()
    car2.unloadingPeople(2)
}