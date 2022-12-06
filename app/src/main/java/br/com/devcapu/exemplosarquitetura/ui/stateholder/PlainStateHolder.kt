package br.com.devcapu.exemplosarquitetura.ui.stateholder

data class PlainStateHolder(
    val shouldBeAbleToClick: Boolean = true,
    val nome: String = "",
    val quandoONomeMudar: (String) -> Unit = { },
)