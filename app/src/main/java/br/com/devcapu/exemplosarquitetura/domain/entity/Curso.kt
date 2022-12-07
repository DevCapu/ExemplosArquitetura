package br.com.devcapu.exemplosarquitetura.domain.entity

import br.com.devcapu.exemploarquiteturaandroid.aula4.entity.Instrutor

data class Curso(
    val titulo: String,
    val subtitulo: String,
    val videos: List<Video>,
    val instrutor: Instrutor
)