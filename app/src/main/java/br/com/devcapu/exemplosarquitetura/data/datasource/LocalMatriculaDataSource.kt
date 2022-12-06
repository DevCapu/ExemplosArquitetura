package br.com.devcapu.exemplosarquitetura.data.datasource

import android.util.Log
import br.com.devcapu.exemplosarquitetura.domain.entity.Video

class LocalMatriculaDataSource {
    fun atualizaProgresso(videoId: Long) {
        Log.d("MatriculaDataSource", "Atualizando progresso...")
    }

    fun buscaVideosAssistidos(): List<Video> {
        return emptyList()
    }
}
