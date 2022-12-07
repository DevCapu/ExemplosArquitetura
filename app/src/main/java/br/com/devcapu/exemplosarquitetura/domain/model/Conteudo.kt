package br.com.devcapu.exemploarquiteturaandroid.aula4.entity

interface Conteudo {
    val nome: String
    val tipo: Tipo
}

enum class Tipo {
    CURSO,
    ALURA_MAIS,
    ARTIGO,
    VIDEO,
    PODCAST
}