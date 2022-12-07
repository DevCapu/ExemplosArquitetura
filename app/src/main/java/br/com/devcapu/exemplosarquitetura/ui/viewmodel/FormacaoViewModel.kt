package br.com.devcapu.exemplosarquitetura.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


data class FormacaoUiState(
    val nome: String = "",
    val ementa: String = "",
    val cursos: List<CursoUiState> = emptyList(),
)

data class CursoUiState(
    val titulo: String,
    val subtitulo: String,
    val duracaoEmHoras: String,
    val nomeInstrutor: String,
)

class FormacaoViewModel : ViewModel() {

    private var _state = MutableStateFlow(FormacaoUiState())
    val state: StateFlow<FormacaoUiState> = _state

    init {
        _state.value = FormacaoUiState(
            nome = "Arquitetura Android",
            ementa = "Aprenda sobre UI, Domain e Data",
            cursos = listOf(
                CursoUiState(
                    titulo = "Camada de UI",
                    subtitulo = "Crie telas reativas",
                    duracaoEmHoras = "8",
                    nomeInstrutor = "Jennifer"
                ),
                CursoUiState(
                    titulo = "Camada de dados",
                    subtitulo = "Gerenciando fontes de dados",
                    duracaoEmHoras = "12",
                    nomeInstrutor = "Alex Felipe"
                ),
                CursoUiState(
                    titulo = "Camada de Domínio",
                    subtitulo = "Foco no negócio",
                    duracaoEmHoras = "6",
                    nomeInstrutor = "Felipe Moreno"
                )
            )
        )
    }
}

