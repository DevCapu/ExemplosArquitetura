package br.com.devcapu.exemplosarquitetura.domain.usecase

import br.com.devcapu.exemplosarquitetura.data.repository.MatriculaRepository
import br.com.devcapu.exemplosarquitetura.data.repository.VideoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.Calendar.getInstance

class AssisteVideoUseCase(
    private val videoRepository: VideoRepository,
    private val matriculaRepository: MatriculaRepository,
) {
    suspend operator fun invoke(
        videoId: Long,
        alunoId: Long,
        quandoTerminar: () -> Unit,
    ) {
        val formataData = FormataDataUseCase()
        val dataFormatada = formataData(getInstance().time)

        withContext(Dispatchers.IO) {
            videoRepository.assiste(videoId, alunoId, dataFormatada) {
                matriculaRepository.atualizaProgresso(videoId = videoId) {
                    quandoTerminar()
                }
            }
        }
    }
}