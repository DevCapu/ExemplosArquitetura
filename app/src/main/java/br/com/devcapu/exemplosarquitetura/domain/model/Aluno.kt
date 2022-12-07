package br.com.devcapu.exemplosarquitetura.domain.model

import java.time.ZonedDateTime

data class Aluno(
    val id: Long,
    val nome: String,
    val email: Email,
    val dataDeNascimento: ZonedDateTime,
    val descricao: String,
)
