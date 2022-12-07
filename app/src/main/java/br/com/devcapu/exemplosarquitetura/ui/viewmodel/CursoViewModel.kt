package br.com.devcapu.exemplosarquitetura.ui.viewmodel

import androidx.lifecycle.ViewModel
import br.com.devcapu.exemplosarquitetura.ui.stateholder.CursoUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class CardCursoUiState(
    val titulo: String = "",
    val subtitulo: String = "",
    val quandoClickar: () -> Unit = { },
    val progresso: String = "",
    val finalizado: Boolean = false,
)

class CursoViewModel : ViewModel() {
    private var _state = MutableStateFlow(CardCursoUiState())
    val state: StateFlow<CardCursoUiState> = _state

    init {
        _state.value = CardCursoUiState(
            titulo = "Kotlin",
            subtitulo = "Aprenda sobre arquitetura Android"
        )
    }
}