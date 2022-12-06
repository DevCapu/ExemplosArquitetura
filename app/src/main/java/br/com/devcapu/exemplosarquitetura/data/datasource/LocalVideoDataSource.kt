package br.com.devcapu.exemplosarquitetura.data.datasource

import android.util.Log

class LocalVideoDataSource {
    fun assiste(videoId: Long, alunoId: Long, data: String) {
        Log.d(
            "LocalVideoDataSource",
            "Marca $videoId como assistido por $alunoId no dia $data"
        )
    }

}
