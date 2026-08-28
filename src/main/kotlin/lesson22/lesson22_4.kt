package org.example.lesson22

class MainScreenViewModel {
    data class MainScreenState(val data: String, val isLoading: Boolean = false)

    private var mainScreenState: MainScreenState? = null
    fun loadData() {
        mainScreenState = MainScreenState("")
        mainScreenState = mainScreenState?.copy(isLoading = true)
        mainScreenState = mainScreenState?.copy(data = "Kotlin", isLoading = false)

    }
}
