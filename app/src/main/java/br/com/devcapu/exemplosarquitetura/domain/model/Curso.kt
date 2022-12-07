package br.com.devcapu.exemplosarquitetura.domain.model

import br.com.devcapu.exemploarquiteturaandroid.aula4.entity.Instrutor

data class Curso(
    val titulo: String,
    val subtitulo: String,
    val videos: List<Video>,
    val instrutor: Instrutor
)