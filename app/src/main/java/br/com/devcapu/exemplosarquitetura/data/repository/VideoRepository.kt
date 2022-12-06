package br.com.devcapu.exemplosarquitetura.data.repository

import android.util.Log
import br.com.devcapu.exemplosarquitetura.data.datasource.ApiVideoDataSource
import br.com.devcapu.exemplosarquitetura.data.datasource.LocalVideoDataSource

class VideoRepository(
    private val localDataSource: LocalVideoDataSource,
    private val apiDataSource: ApiVideoDataSource,

    ) {
    suspend fun assiste(
        videoId: Long,
        alunoId: Long,
        data: String,
        quandoTerminar: suspend () -> Unit,
    ) {
        try {
            localDataSource.assiste(videoId, alunoId, data)
            apiDataSource.assiste(videoId, alunoId, data)
            quandoTerminar()
        } catch (exception: Exception) {
            Log.d("VideoRepository", "Não foi possível assistir o vídeo")
        }
    }
}