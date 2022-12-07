package br.com.devcapu.exemplosarquitetura.data.datasource

import android.util.Log
import br.com.devcapu.exemploarquiteturaandroid.aula4.entity.Instrutor
import br.com.devcapu.exemplosarquitetura.domain.entity.Curso
import br.com.devcapu.exemplosarquitetura.domain.entity.Video

class LocalMatriculaDataSource {
    fun atualizaProgresso(videoId: Long) {
        Log.d("MatriculaDataSource", "Atualizando progresso...")
    }

    fun buscaVideosAssistidos(): List<Video> {
        return emptyList()
    }

    fun atualiza(cursos: List<Curso>) {
        Log.d("MatriculaDataSource", "Atualizando cursos com matricula...")
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
            ),
            Curso(
                titulo = "Andorid com Kotlin",
                subtitulo = "Testes instrumentados",
                videos = emptyList(),
                instrutor = Instrutor(
                    nome = "Alex Felipe",
                    foto = "url.fake.com",
                    descricao = "Instrutor Android"
                )
            ),

        )
    }
}
