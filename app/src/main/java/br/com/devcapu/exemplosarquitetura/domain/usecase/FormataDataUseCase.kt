package br.com.devcapu.exemplosarquitetura.domain.usecase

import java.text.SimpleDateFormat
import java.util.*

class FormataDataUseCase {
    operator fun invoke(time: Date): String {
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm")
        return formatter.format(time)
    }
}