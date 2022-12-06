package br.com.devcapu.exemplosarquitetura.ui.stateholder

data class CardCursoUiState(
    val titulo: String = "",
    val subtitulo: String = "",
    val quandoClickar: () -> Unit = { },
    val progresso: String = "",
    val finalizado: Boolean = false,
)