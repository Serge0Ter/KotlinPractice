package org.example.lesson22

data class MainScreenState(val data: String, val isLoading: Boolean = false)
class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState("")
    fun loadData() {
        if (mainScreenState != MainScreenState("Kotlin", false)) {
            mainScreenState = mainScreenState.copy(isLoading = true)
            mainScreenState = mainScreenState.copy(data = "Kotlin", isLoading = false)
        }
    }
}
