package br.com.devcapu.exemplosarquitetura.data.repository

import android.util.Log
import br.com.devcapu.exemplosarquitetura.config.TEM_INTERNET
import br.com.devcapu.exemplosarquitetura.data.datasource.LocalMatriculaDataSource
import br.com.devcapu.exemplosarquitetura.data.datasource.RemoteMatriculaDataSource

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
}
