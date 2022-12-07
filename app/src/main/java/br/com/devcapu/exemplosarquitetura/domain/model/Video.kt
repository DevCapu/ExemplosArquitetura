package br.com.devcapu.exemplosarquitetura.domain.model

import br.com.devcapu.exemploarquiteturaandroid.aula4.entity.Instrutor

data class Video(
    private val id: Long,
    val tamanho: Long,
    val titulo: String,
    val instrutor: Instrutor,
)