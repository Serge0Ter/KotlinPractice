package org.example.lesson22

data class MainScreenState(val data: String, val isLoading: Boolean = false)
class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState("отсутствие данных")
    fun loadData() {
        if (mainScreenState != MainScreenState("наличие загруженных данных", false)) {
            mainScreenState = mainScreenState.copy(data = "загрузка данных", isLoading = true)
            mainScreenState = mainScreenState.copy(data = "наличие загруженных данных", isLoading = false)
        }
    }
}
