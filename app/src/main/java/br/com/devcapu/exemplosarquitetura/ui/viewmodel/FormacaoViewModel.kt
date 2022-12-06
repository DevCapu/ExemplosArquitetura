package br.com.devcapu.exemplosarquitetura.ui.stateholder

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


data class CursoUiState(
    val nome: String = "",
    val ementa: String = "",
)

class CursoViewModel : ViewModel() {
    private var _state = MutableStateFlow(CursoUiState())
    val state: StateFlow<CursoUiState> = _state

    init {
        _state.value = CursoUiState(
            nome = "Kotlin",
            ementa = "Aprenda sobre arquitetura Android"
        )
    }
}
