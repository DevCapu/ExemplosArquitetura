package br.com.devcapu.exemplosarquitetura.data.datasource

import android.util.Log

class ApiVideoDataSource {
    fun assiste(videoId: Long, alunoId: Long, data: String) {
        Log.d(
            "ApiVideoDataSource",
            "Aluno com o id: $alunoId, assistiu o video com o id: $videoId em $data"
        )
    }
}
