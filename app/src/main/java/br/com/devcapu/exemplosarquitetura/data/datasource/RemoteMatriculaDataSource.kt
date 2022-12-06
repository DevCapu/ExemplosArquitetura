package br.com.devcapu.exemplosarquitetura.data.datasource

import android.util.Log
import br.com.devcapu.exemplosarquitetura.domain.entity.Video

class RemoteMatriculaDataSource {

    fun atualizaProgresso(videosAssistidos: List<Video>) {
        Log.d("MatriculaDataSource", "Atualizando progresso online")
    }
}
