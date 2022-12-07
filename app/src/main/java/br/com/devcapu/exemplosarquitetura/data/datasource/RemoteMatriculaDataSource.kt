package br.com.devcapu.exemplosarquitetura.data.datasource

import android.util.Log
import br.com.devcapu.exemploarquiteturaandroid.aula4.entity.Instrutor
import br.com.devcapu.exemplosarquitetura.domain.entity.Curso
import br.com.devcapu.exemplosarquitetura.domain.entity.Video

class RemoteMatriculaDataSource {

    fun atualizaProgresso(videosAssistidos: List<Video>) {
        Log.d("MatriculaDataSource", "Atualizando progresso online")
    }

    fun buscaTodos(): List<Curso> {
        return listOf(
            Curso(
                titulo = "Andorid com Kotlin",
                subtitulo = "Arquitetura android",
                videos = emptyList(),
                instrutor = Instrutor(
                    nome = "Felipe Moreno",
                    foto = "url.fake.com",
                    descricao = "Desenvolvedor e instrutor android"
                )
            )
        )
    }
}
