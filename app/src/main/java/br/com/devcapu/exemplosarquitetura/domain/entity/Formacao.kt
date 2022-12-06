package br.com.devcapu.exemploarquiteturaandroid.aula4.entity

data class Formacao(
    val titulo: String,
    val subtitulo: String,
    val ementa: String,
    val conteudo: List<Conteudo>,
    val instrutores: List<Instrutor>,
)