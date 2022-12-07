package br.com.devcapu.exemplosarquitetura.data.repository

import android.util.Log
import br.com.devcapu.exemplosarquitetura.config.TEM_INTERNET
import br.com.devcapu.exemplosarquitetura.data.datasource.LocalMatriculaDataSource
import br.com.devcapu.exemplosarquitetura.data.datasource.RemoteMatriculaDataSource
import br.com.devcapu.exemplosarquitetura.domain.model.Curso

class MatriculaRepository(
    private val localMatriculaDataSource: LocalMatriculaDataSource,
    private val remoteMatriculaDataSource: RemoteMatriculaDataSource,
) {
    suspend fun atualizaProgresso(videoId: Long, quandoTermina: () -> Unit) {
        try {
            localMatriculaDataSource.atualizaProgresso(videoId)
            if (TEM_INTERNET) {
                val videosAssistidos = localMatriculaDataSource.buscaVideosAssistidos()
                remoteMatriculaDataSource.atualizaProgresso(videosAssistidos)
            }
            quandoTermina()
        } catch (exception: Exception) {
            Log.d("MatriculaRepository", "Não foi possivel atualizar o progresso")
        }
    }

    suspend fun buscaCursosMatriculados(): List<Curso> {
        try {
            val cursos = remoteMatriculaDataSource.buscaTodos()
            localMatriculaDataSource.atualiza(cursos)
        } catch (excecao: Exception) {
            Log.e("MatriculaRepository", "Não foi possível buscar online os cursos")
        }
        return localMatriculaDataSource.buscaTodos()
    }
}
